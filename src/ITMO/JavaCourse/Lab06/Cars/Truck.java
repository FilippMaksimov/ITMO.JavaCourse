package ITMO.JavaCourse.Lab06.Cars;

public class Truck extends Car {
    private int wheelNumber;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelNumber, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelNumber = wheelNumber;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newWheelsNumber) {
        this.wheelNumber = newWheelsNumber;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Количество колёс: " + wheelNumber + ". Максимальный вес грузовика: " + maxWeight + "кг.");
    }
}
