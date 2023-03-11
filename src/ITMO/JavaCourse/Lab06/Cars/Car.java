package ITMO.JavaCourse.Lab06.Cars;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void Output() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }
    public Car(int w, String m, char c, float s) {
        this.weight = w;
        this.model = m;
        this.color = c;
        this.speed = s;
    }
    public Car() {
    }
}
