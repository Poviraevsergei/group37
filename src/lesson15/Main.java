package lesson15;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Не допускает дубликаты
        //не упорядочена
        //быстро ищет ун-ые эл-ты
        HashSet<? super Number> names = new HashSet<>();
        names.add(5);
        names.add(Float.parseFloat("4.1"));

        HashSet<Boolean> bool = new HashSet<>();

        System.out.println(names);

        //Упорядочена(по возрастанию, по алфавиту, передать comporator)
        TreeSet<Integer> num = new TreeSet<>();
        num.add(2);
        num.add(-4);
        num.add(8);
        num.add(-6);

        //хранит уникальные в порядке добавления
        LinkedHashSet<Integer> boolExample = new LinkedHashSet<>();
        boolExample.add(1);
        boolExample.add(2);
        boolExample.add(3);
        boolExample.add(4);
        boolExample.add(5);
        boolExample.add(null);

        System.out.println(boolExample);
    }
}

//ArrayList:
// могут хранить дубликаты
//хранит эл-ты в порядке добавления
//Время поиска по интексу О(1)
//Медленное удаление/вставка в середину O(n)
//List<String> list = new ArrayList<>();

//LinkedList(двусвязный список):
//Может хранить дубликаты
//Храни эл-ты в порядке добавления
//Медленный поиск О(n)
//Быстрое добавление/удаление по краям O(1)

//ArrayDeque может работать как FIFO так и LIFO
//Не допускает null эл-ты

//FIFO
//ArrayDeque<String> names = new ArrayDeque<>();
//names.offerLast("Dima"); //добавить в конец очереди
//names.offerLast("Anton");
//names.offerLast("Lena");
//System.out.println(names.peekFirst());
//System.out.println(names);
//System.out.println(names.pollFirst()); //удали из начала и верни эл-т
//System.out.println(names);

//LIFO(Стек)
//names.push("Hello"); //добавить эл-т(режим работы стек)
//names.push("World");
//names.push("!!!");
//System.out.println(names);
//names.pop(); //удали и верни эл-т(режим работы стек)
//System.out.println(names);
//System.out.println(names.peek()); //посмотреть след. эл-т
//System.out.println(names);

//Двусторонняя очередь
//names.offerFirst("e"); // добавь в начало
//names.offerLast("e"); // добавь в конец
//names.pollFirst(); // удали из начала
//names.pollLast(); // удали из конца
//names.peekFirst(); // эл-т(без удаления) в начале
//names.peekLast(); // эл-т(без удаления) в конце

//PriorityQueue<Cat> numbers = new PriorityQueue<>();
//numbers.add(new Cat(1));
//numbers.add(new Cat(5));
//numbers.add(new Cat(3));
//numbers.add(new Cat(7));
//System.out.println(numbers.poll());
//System.out.println(numbers.poll());
//System.out.println(numbers.poll());
//System.out.println(numbers.poll());