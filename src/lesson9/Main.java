package lesson9;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchFieldException, IllegalAccessException {
        //toString() getClass()
        Student studentMaria = new Student();
        Class classInfo = studentMaria.getClass();
        Field fieldAge = classInfo.getDeclaredField("age");
        fieldAge.setAccessible(true);
        fieldAge.set(studentMaria, 20);
        System.out.println(studentMaria);

        //studentMaria.setAge(22);
        //studentMaria.setFirstname("Maria");
        //studentMaria.setDog(new Dog("Bob"));

        //clone()
        //Student studentMariaCopied = (Student) studentMaria.clone();
        //studentMaria.getDog().setName("NEW_NAME");
        //System.out.println(studentMaria.getDog().getName());
        //System.out.println(studentMariaCopied.getDog().getName());


        //hashCode - возвращает hashCode(int значение объекта)
        //System.out.println(studentMaria.hashCode());
        //System.out.println(studentMaria1.hashCode());

        //equals
        //1. До переопределения метод equals сравнивает ссылки (используя ==)
        //2. После переопределения equals он сравнивает значения в полях объекта
        //3. Контракт между equals и hashCode
        //System.out.println(studentArtem.equals(inputStudent));
    }
}
