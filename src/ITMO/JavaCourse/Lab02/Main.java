package ITMO.JavaCourse.Lab02;

public class Main {
    public static void main(String[] args) {
        //Первое задание
        long sumRes = Calculator.Calc(799, 1789212L);
        double devRes = Calculator.Calc(7837.5, 67);
        double mulRes = Calculator.Calc(5678.1, 156L);
        long subRes = Calculator.Calc(1999999L, 1562);
        System.out.println("Первое задание");
        System.out.println(sumRes);
        System.out.println(devRes);
        System.out.println(mulRes);
        System.out.println(subRes);

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
