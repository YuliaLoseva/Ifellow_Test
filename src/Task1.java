import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {
        massiveMethod();
    }

    /**
     * Задача 1 - легкая:
     * Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение.
     * Для генерации случайного числа использовать метод Math.random(), который возвращает значение в промежутке [0, 1].
     */

    public static void massiveMethod() {
        double[] values = new double[10];
        for (int i = 0; i < 10; i++) {
            values[i] = Math.random();
            System.out.println(values[i]);
        }

        double average = Arrays.stream(values).sum() / values.length;
        Arrays.sort(values);

        System.out.println("Minimum val: " + values[0]);
        System.out.println("Average val: " + average);
        System.out.println("Maximum val: " + values[values.length - 1]);
    }
}


