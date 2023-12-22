package task1;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Проверка наличия двух аргументов командной строки
        if (args.length != 2) {
            System.out.println("Аргументы введены неверно");
            return;
        }

        // Парсинг аргументов командной строки в целые числа
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        // Проверка, что оба числа положительные
        if (n <= 0 || m <= 0) {
            System.out.println("Оба аргумента должны быть положительные");
            return;
        }

        // Создание кругового массива 1 2 3 4 5...
        StringBuilder path = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            path.append(i);
        }

        // Обход кругового массива и формирование списка результатов
        ArrayList<Character> result = new ArrayList<>();
        int currentIndex = 0;

        while (result.size() < n) {
            // Добавление текущего элемента в список результатов
            result.add(path.charAt(currentIndex));
            // Вычисление индекса следующего элемента с учетом интервала m
            currentIndex = (currentIndex + m - 1) % n;
        }
        // Вывод списка результатов
        for (char element : result) {
            System.out.print(element);
        }
    }
}