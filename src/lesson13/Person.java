package lesson13;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) throws CustomAgeException {
        if (age <= 18) {
            throw new CustomAgeException(age);
        }
        this.age = age;
        this.name = name;
    }
}
