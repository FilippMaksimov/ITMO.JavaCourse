package ITMO.JavaCourse.Lab02;

public class Main {
    public static void main(String[] args) {
        //Первое задание
        System.out.println("Первое задание");
        Calculator.getResult(799, 1789212);
        Calculator.getResult(7837.5f, 67f);
        Calculator.getResult(5678.1, 156d);
        Calculator.getResult(1999999L, 1562L);

        //Второе задание
        MedicalRecord patient = new MedicalRecord();
        patient.setPatientID(101);
        patient.setGender(true);
        patient.setHeight(183.1f);
        patient.setWeight(76.4f);
        patient.setBloodType(BloodType.OB);
        patient.setRhFactor(false);
        patient.setHairColor("Черные");
        patient.setEyeColor("Серые");
        patient.setBadHabits(true);
        patient.setVaccination(true);
        System.out.println(patient);
    }
}
