package lesson7.polimorf;

public class Main {
    public static void main(String[] args) {
        //Полиморфизм:
        //Перегрузка метода
        //Переопеределение метода
        //Animal animal = new Animal();
        //animal.voice();

        //Dog dog = new Dog();
        //dog.voice();

        Animal dogAnimal = new Cat();
        dogAnimal.voice();

        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();
    }
}
