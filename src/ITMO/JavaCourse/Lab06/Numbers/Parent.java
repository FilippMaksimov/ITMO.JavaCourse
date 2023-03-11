package ITMO.JavaCourse.Lab06.Numbers;

import java.util.Scanner;

public class Parent {
    private Integer number;
    public Parent() {
        Scanner scanner = new Scanner(System.in);
        this.number = scanner.nextInt();
    }
    public Integer getNumber() {
        return number;
    }
}
