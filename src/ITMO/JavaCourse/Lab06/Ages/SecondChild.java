package ITMO.JavaCourse.Lab06.Ages;

public class SecondChild extends SecondParent {
    @Override
    public  void getInfo() {
        System.out.println("User name: " + getScanner().nextLine());
    }
}
