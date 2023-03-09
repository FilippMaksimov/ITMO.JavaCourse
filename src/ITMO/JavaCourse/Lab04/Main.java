package ITMO.JavaCourse.Lab04;

public class Main {
    public static void main(String[] args) {
        //First Part
        Program.oddNumbersOutput();
        Program.devisionOutput();
        System.out.println("Результат: " + Program.sumCheck(5,10, 15));
        System.out.println("Результат: " + Program.comparisonCheck(5,10, 15));
        int[] array = new int[] {3, 5, 6, 4, 5, 3};
        Program.arrayItemsCheck(array);
        Program.arrayAllItemsCheck(array);
        //Second Part
        int[] unsortedArray = new int[] {3, 7, 2, 5, 6, 9};
        int[] sortedArray = new int[] {1, 2, 6, 7, 10, 12};
        Program.ascSortCheck(sortedArray);
        Program.ascSortCheck(unsortedArray);
        Program.arrayItemsExchange(unsortedArray);
        int[] uniqueArray = new int[] {1, 2, 7, 1, 2, 4};
        Program.arrayUniqueItems(uniqueArray);

        //Ввод с консоли
        Program.arrayRead();
    }
}
