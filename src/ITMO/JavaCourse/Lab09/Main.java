package ITMO.JavaCourse.Lab09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Первое задание
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(11);
        System.out.println("Второе задание");
        System.out.println(CollectionsMethods.printNoDuplicateList(numbers) + "\n");
        //Третье задание
        ArrayList<Byte> arrayList = new ArrayList<>();
        LinkedList<Byte> linkedList = new LinkedList<>();
        CollectionsMethods.addItems(arrayList, linkedList);
        CollectionsMethods.printRandomItem(arrayList);
        CollectionsMethods.printRandomItem(linkedList); //дольше загружает элементы

        //Четвёртое задание
        System.out.println("Четвёртое задание");
        CollectionsMethods.printUserInfo();
    }
}
