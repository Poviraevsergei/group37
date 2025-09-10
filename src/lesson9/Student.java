package lesson9;

import java.io.Serializable;
import java.util.Objects;

public final class Student implements Cloneable {
    private String firstname;
    private int age = 7;
    public Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clonedStudent = (Student) super.clone();
        Dog clonedDog = (Dog) clonedStudent.getDog().clone();
        clonedStudent.setDog(clonedDog);
        return clonedStudent;
    }

/*    @Override
    protected void finalize() throws Throwable {

    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstname, student.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", age=" + age +
                '}';
    }
}
