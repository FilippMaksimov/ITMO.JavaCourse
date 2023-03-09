package ITMO.JavaCourse.Lab04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    //FIRST PART
    public static void firstTask() {
        System.out.println("Первое задание" + "\n" + "Нечетные числа от 1 до 99");
        for (Integer i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void secondTask() {
        System.out.println("\n" + "Второе задание");
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        a.append("Делится на 3: ");
        b.append("Делится на 5: ");
        c.append("Делится на 3 и на 5: ");
        for (Integer i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                a.append(i + ", ");
            else continue;
        }
        for (Integer i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                b.append(i + ", ");
            else continue;
        }
        for (Integer i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                c.append(i + ", ");
            else continue;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void thirdTask(Integer firstValue, Integer secondValue, Integer result) {
        boolean sum;
        if (firstValue + secondValue == result)
            sum = true;
        else sum = false;
        String first = "Введите первое число: " + firstValue;
        String second = "Введите второе число: " + secondValue;
        String third = "Введите третье число: " + result;
        String isRes = "Результат: " + sum;
        System.out.println("\n" + "Третье задание");
        System.out.println(first + "\n" + second + "\n" + third + "\n" + isRes);
    }

    public static void forthTask(Integer firstValue, Integer secondValue, Integer thirdValue) {
        boolean greaterOrLess;
        if (secondValue > firstValue && thirdValue > secondValue)
            greaterOrLess = true;
        else greaterOrLess = false;
        String first = "Введите первое число: " + firstValue;
        String second = "Введите второе число: " + secondValue;
        String third = "Введите третье число: " + thirdValue;
        String isRes = "Результат: " + greaterOrLess;
        System.out.println("\n" + "Четвёртое задание");
        System.out.println(first + "\n" + second + "\n" + third + "\n" + isRes);
    }

    public static void fifthTask(int[] array) {
        boolean isEqual;
        System.out.println("\n" + "Пятое задание");
        String data = "array = " + Arrays.toString(array);
        if (array.length >= 2) {
            if (array[0] == 3 && array[array.length - 1] == 3)
                isEqual = true;
            else isEqual = false;
            System.out.println(data + "\n" + isEqual);
        } else System.out.println("Длина массива должна быть больше или равна 2");
    }

    public static void sixthTask(int[] array) {
        boolean isContent = false;
        System.out.println("\n" + "Шестое задание");
        String data = "array = " + Arrays.toString(array);
        for (int item : array) {
            if (item == 1 || item == 3) {
                isContent = true;
                break;
            } else continue;
        }
        System.out.println(data + "\n" + "Содержит ли массив числа 1 или 3: " + isContent);
    }

    //SECOND PART
    public static void eighthTask(int[] array) {
        String res = "OK";
        for (int i = 0; i <= (array.length - 2); i++) {
            if (array[i] > array[i + 1]) {
                res = "Please, try again";
                break;
            }
        }
        System.out.println("\n" + "Вторая часть. Первое задание");
        System.out.println("Отсортирован ли массив по возрастанию?" + "\n" + res);
    }

    public static void ninthTask() {
        System.out.println("\n" + "Вторая часть. Второе задание");
        System.out.println("Array length(input data): ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Numbers of array:");
        for (int i = 0; i <= length - 1; i++) {
            Scanner element = new Scanner(System.in);
            array[i] = element.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    public static void tenthTask(int[] array) {
        System.out.println("\n" + "Вторая часть. Третье задание");
        System.out.println("Array 1: " + Arrays.toString(array));
        int[] editedArray = new int[array.length];
        editedArray[0] = array[array.length - 1];
        editedArray[editedArray.length - 1] = array[0];
        for (int i = 0; i <= (editedArray.length - 1); i++) {
            if (i == 0 || i == (editedArray.length - 1))
                continue;
            else editedArray[i] = array[i];
        }
        System.out.println("Array 2: " + Arrays.toString(editedArray));
    }

    public static void eleventhTask(int[] array) {
        StringBuilder result = new StringBuilder();
        ArrayList<Integer> unique = new ArrayList<>();
        System.out.println("\n" + "Вторая часть. Четвёртое задание");
        System.out.println("Массив:" + Arrays.toString(array));
        result.append("Уникальные числа в массиве (по порядку): ");
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        for (int i = 0; i <= (sortedArray.length - 1); i++) {
            if (i < sortedArray.length - 1) {
                if (sortedArray[i] != sortedArray[i + 1] && sortedArray[i] != sortedArray[i - 1])
                    unique.add(sortedArray[i]);
            } else {
                if (sortedArray[i] != sortedArray[i - 1])
                    unique.add(sortedArray[i]);
            }
        }
        for (int k = 0; k <= (array.length - 1); k++) {
            for (int item : unique) {
                if (array[k] == item) {
                    result.append(" " + array[k]);
                }
            }
        }
        System.out.println(result);
    }
}
