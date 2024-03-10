package lesson_5;

import org.junit.jupiter.api.Test;

import java.util.SplittableRandom;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void sum() {
        Service service = new Service(new Fetcher());
        int result = service.sum(1, 2);
        assertEquals(3, result);
        assertNotEquals(5, result);
    }

    @Test
    void sumException() {
        Service service = new Service(new Fetcher());
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> service.sum(null, 2));
        assertEquals("Первый параметр равен нулю", runtimeException.getMessage());

    }

    @Test
    void sumWithDefaultValue() {
        Service service = new Service(new Fetcher());
        int result = service.sum(10, null);
        assertEquals(20, result);

    }
}