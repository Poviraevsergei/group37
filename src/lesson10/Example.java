package lesson10;

public class Example {

    public void method1(){
        method2();
    }

    public void method2(){
        method3();
    }

    public void method3(){
        System.out.println("Method 3");
    }

}
