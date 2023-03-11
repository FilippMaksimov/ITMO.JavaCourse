package ITMO.JavaCourse.Lab06.Persons;

public class Employee extends Person {
    private String head = "Название банка: ";
    private String bankName;
    private String position;
    private Float salary;
    private String hireDay;

    public Employee(String name, String lastname, String bankName) {
        super(name, lastname);
        this.bankName = bankName;
    }

    @Override
    public void getInfo() {
        System.out.println(TITLE);
        System.out.println(head + bankName);
        System.out.println(printStatus());
        System.out.println(getName() + " " + getLastname());
        if (!position.isEmpty() || !salary.isNaN() || !hireDay.isEmpty()){
            personDetails();
        }
    }

    @Override
    public String printStatus() {
        return "Employee";
    }

    @Override
    public void personDetails() {
        System.out.println("Employee details");
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("Date of hiring: " + hireDay);
    }

    public void setAllEmployeeDetails(String position, Float salary, String hireDay) {
        this.position = position;
        this.salary = salary;
        this.hireDay = hireDay;
    }
}
