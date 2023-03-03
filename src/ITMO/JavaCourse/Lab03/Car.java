package ITMO.JavaCourse.Lab03;

import org.w3c.dom.css.Counter;

public class Car {
    private String carName;
    private String color;
    private Float weight;
    public void setEmpty() {}
    public void setColorAndWeight(String color, Float weight) {
        this.color = color;
        this.weight = weight;
    }
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return  "\n" + "Автомобиль" + "\n" +
                "Название: " + carName + "\n" +
                "Цвет:" + color + "\n" +
                "Вес: " + weight;
    }
}
