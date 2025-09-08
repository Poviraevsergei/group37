package lesson8;

public abstract class Doctor {
    public String name;
    abstract boolean treat();

    void standartMethod(){
        System.out.println("standartMethod");
    }
}
