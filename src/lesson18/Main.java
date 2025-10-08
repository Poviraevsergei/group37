package lesson18;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "ABR";
        Optional<String> line = Optional.ofNullable(name);
        //line.ifPresent(l -> System.out.println(l.length()));
        //String resultFromOptional = line.orElse("DEFAULT");
        //String resultFromLambda = line.orElseGet(() -> {
        //    Scanner scanner = new Scanner(System.in);
        //    return scanner.nextLine();
        //});
        //String resultFromLambda = line.orElseThrow();

        System.out.println(line.filter(n -> n.length() > 5));
        System.out.println(line.map(n -> n.length()));

        //if (line.isPresent()){
        //    System.out.println(line);
        //    System.out.println(line.get());
        //}
    }
}
