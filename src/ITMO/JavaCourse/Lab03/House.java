package ITMO.JavaCourse.Lab03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class House {
    private String houseName;
    private Integer dateOfBuild;
    private Integer level;

    public void setValues(String houseName, Integer dateOfBuild, Integer level) {
        this.houseName = houseName;
        this.dateOfBuild = dateOfBuild;
        this.level = level;
    }
    private Integer setAge(){
        return 2023 - this.dateOfBuild;
    }
    @Override
    public String toString() {
        return  "\n" + "Здание" + "\n" +
                "Наименовение: " + houseName + "\n" +
                "Дата постройки: " + dateOfBuild + "\n" +
                "Этажность: " + level + "\n" +
                "Количество лет с момента постройки: " + setAge();
    }
    public void printData()
    {
        System.out.println(toString());
    }
}
