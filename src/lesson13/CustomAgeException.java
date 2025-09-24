package lesson13;

public class CustomAgeException extends Exception {
    private final int AGE;

    public CustomAgeException(int age) {
        this.AGE = age;
    }

    @Override
    public String toString() {
        return "Неверный возраст CustomAgeException{" +
                "AGE=" + AGE +
                '}';
    }
}
