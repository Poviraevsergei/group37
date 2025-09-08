package lesson7.polimorf;

public class Animal {

    //Перегрузка - методы с одинаковым неазванием, но разным кол-вом, типом, последовательностью параметров.
    public void voice(){
        System.out.println("что-то кричит");
    }

    public void voice(String voice){
        System.out.println(voice);
    }
}
