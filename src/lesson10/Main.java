package lesson10;

import lesson9.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Serg"; //String pool
        String name1 = "Serg"; //String pool


        System.out.println(name == name1);
        System.out.println(name.equals(name1));
    }
}
