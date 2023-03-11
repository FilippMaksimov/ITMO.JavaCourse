package ITMO.JavaCourse.Lab06;

import ITMO.JavaCourse.Lab06.Ages.SecondChild;
import ITMO.JavaCourse.Lab06.Ages.SecondParent;
import ITMO.JavaCourse.Lab06.Cars.Car;
import ITMO.JavaCourse.Lab06.Cars.Truck;
import ITMO.JavaCourse.Lab06.Numbers.Child;
import ITMO.JavaCourse.Lab06.Numbers.Parent;
import ITMO.JavaCourse.Lab06.Persons.Client;
import ITMO.JavaCourse.Lab06.Persons.Employee;
import ITMO.JavaCourse.Lab06.Persons.Person;

public class Main {
    public static void main(String[] args) {
        //Persons (Bank)
        Float[] deposit = new Float[]{1578.0f, 1461.8f, 2312.0f};
        Float[] withdraw = new Float[]{132.2f, 232.4f, 210.0f};
        Person client = new Client("Anton", "Vasiliev", "Alpha", deposit, withdraw);
        client.getInfo();

        System.out.println("");
        Person employee = new Employee("Angelina", "Ivanova", "Alpha");
        ((Employee) employee).setAllEmployeeDetails("Data Engineer", 5700.0f, "21.02.2020");
        employee.getInfo();

        //Transport(Cars)
        System.out.println("");
        Car truck = new Truck(2500, "Honda", 'b', 90.6f, 4, 5000);
        ((Truck)truck).newWheels(6);
        truck.Output();

        //Print number
        System.out.println("");
        System.out.println("Enter the number: ");
        Child child = new Child();
        child.printOut();

        //Users
        System.out.println("");
        SecondChild secondChild = new SecondChild();
        SecondParent secondParent = new SecondParent();
        secondParent.getInfo();
        secondChild.getInfo();
    }
}
