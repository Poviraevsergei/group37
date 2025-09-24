package lesson14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainCharStream {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (FileReader fileReader = new FileReader("D:\\group37.txt")) {
            int i;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        try (FileWriter fileWriter = new FileWriter("D:\\log.txt", true)) {
            fileWriter.write("message");
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        try (FileWriter fileWriter1 = new FileWriter("D:\\group37NewFile.txt", true)) {
            fileWriter1.write("44444444");
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        System.out.println(sb);
    }
}
