package ITMO.JavaCourse.Lab04;

public class Main {
    public static void main(String[] args) {
        //First Part
        Program.firstTask();
        Program.secondTask();
        Program.thirdTask(5,10, 15);
        Program.forthTask(5,10, 15);
        int[] array = new int[] {3, 5, 6, 4, 5, 3};
        Program.fifthTask(array);
        Program.sixthTask(array);
        //Second Part
        int[] unsortedArray = new int[] {3, 7, 2, 5, 6, 9};
        int[] sortedArray = new int[] {1, 2, 6, 7, 10, 12};
        Program.eighthTask(sortedArray);
        Program.eighthTask(unsortedArray);
        Program.tenthTask(unsortedArray);
        int[] uniqueArray = new int[] {1, 2, 7, 1, 2, 4};
        Program.eleventhTask(uniqueArray);

        //Ввод с консоли
        Program.ninthTask();
    }
}
