package ITMO.JavaCourse.Lab07;

public class Main {
    public static void main(String[] args) {
        Plane firstPlane = new Plane();
        firstPlane.printInfo(5400);

        Plane secondPlane = new Plane();
        secondPlane.printInfo(5800);

        //Using static class:
        Plane.Wing wing = new Plane.Wing(4000);
        wing.printWeight();
    }
}
