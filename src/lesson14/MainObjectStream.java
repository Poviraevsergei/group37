package lesson14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Cat cat = new Cat("Ilya");

       //Сериализация
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(
               new FileOutputStream("D://catIlya.txt"));
       objectOutputStream.writeObject(cat);
       objectOutputStream.close();

        //Десериализация
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("D://catIlya.txt"));
        Cat catFromFile = (Cat) objectInputStream.readObject();
        System.out.println(catFromFile.getName());
        System.out.println(catFromFile.getPassword());
        //3.Создайте класс Game(хранит состояние игры.
        // Поля: userName, lvl, score), напишите методы для загрузки и сохранения игры.
        //
    }
}
