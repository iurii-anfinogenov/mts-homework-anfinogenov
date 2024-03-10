package lesson_5;

public class Service {
    private final Fetcher fetcher;

    public Service(Fetcher fetcher) {
        this.fetcher = fetcher;
    }

    public int sum(Integer first, Integer second) {
        System.out.println(">> sum() first " + first + "second " + second);
        if (first == null) {
            throw new RuntimeException("Первый параметр равен нулю");
        }
        if (second == null) {
            System.out.println("Обнаружено пустое значение. Берем дефолтное");
            second = fetcher.getDefaultValue();
        }
        int result = first + second;
        System.out.printf(">> sum() result " + result);
        return result;
    }
}
