package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader cr = new FileReader(args[0]);
        FileReader data = new FileReader(args[1]);

        Scanner crScanner = new Scanner(cr);
        Scanner dataScanner = new Scanner(data);

        float centerX = crScanner.nextFloat();
        float centerY = crScanner.nextFloat();
        float radius = crScanner.nextFloat(); // Считываем радиус из файла с окружностью

        while (dataScanner.hasNext()) {
            float pointX = dataScanner.nextFloat();
            float pointY = dataScanner.nextFloat();

            float distance = (float) Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));

            if (distance == radius) {
                System.out.println(0); // На окружности
            } else if (distance < radius) {
                System.out.println(1); // Внутри окружности
            } else {
                System.out.println(2); // Снаружи окружности
            }
        }
        crScanner.close();
        dataScanner.close();
    }
}
