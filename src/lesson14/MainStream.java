package lesson14;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;

public class MainStream {
    public static void main(String[] args) {
        File file = new File("D:\\cat.jpg");
        File newCatFile = new File("D:\\newdir\\cat.jpg");

        //FileInputStream - в java app
        //1. создать поток
        //2. создать переменную куда мы будем загружать информацию
        //3. выгружаем по 1 байтику :(
        int index = 0;
        byte[] catPicture = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)) {
            int i;
            while ((i = fis.read()) != -1) {
                catPicture[index++] = (byte) i;
            }
            //fis.read(catPicture);
        } catch (IOException e) {
            System.out.println("Exception:" + e);
        }

        //FileOutputStream - из java app
        try (FileOutputStream fos = new FileOutputStream(newCatFile)) {
            fos.write(catPicture);
        } catch (IOException e) {
            System.out.println("Exception:" + e);
        }
    }
}
