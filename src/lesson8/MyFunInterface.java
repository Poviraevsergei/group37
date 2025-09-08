package lesson8;

//должен быть один абстрактный метод;

@FunctionalInterface
public interface MyFunInterface {
    void oneMethod();

    default void secondMethod(){
        System.out.println(":)");
    }
}
