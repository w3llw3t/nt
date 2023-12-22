package task4;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 {

    public static float median = 0;
    public static float sum = 0;

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> array = new ArrayList<>();

        FileReader reader = new FileReader(args[0]);
        Scanner in = new Scanner(reader);

        while (in.hasNext()) {
            array.add(Integer.parseInt(in.nextLine()));
        }
        Collections.sort(array); // сортировка по возрастанию
        if (array.size() % 2 == 0) { // если кол-во элементов в массиве четное
            //то возвращаем половину от суммы двух средних элементов массива
            median = (array.get(array.size() / 2) + array.get(array.size() / 2 - 1)) / 2.0f;
        } else { //если количество элементов нечётное, то возвращаем средний элемент массива
            median = (array.get(array.size() / 2)); // медиана
        }
        for (int j : array) {
            float b = Math.abs(j - median); // разность модуля каждого элемента массива с медианой
            sum += b; // сумма разностей
        }
        System.out.println(Math.round(sum));
    }
}