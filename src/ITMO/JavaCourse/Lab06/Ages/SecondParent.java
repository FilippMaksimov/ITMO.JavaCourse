package ITMO.JavaCourse.Lab06.Ages;

import java.util.Scanner;

public class SecondParent {
    private Scanner scanner = new Scanner(System.in);
    public void getInfo() {
        System.out.println("Age: " + scanner.nextInt());
    }
    public Scanner getScanner() {
        return scanner;
    }
}
