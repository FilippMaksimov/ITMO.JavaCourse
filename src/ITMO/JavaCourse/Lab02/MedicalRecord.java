package ITMO.JavaCourse.Lab02;

public class MedicalRecord {
    private Integer patientID;
    private Boolean gender;
    private Float height;
    private Float weight;
    private BloodType bloodType;
    private Boolean RhFactor;
    private String hairColor;
    private String eyeColor;
    private Boolean badHabits;
    private Boolean vaccination;

    //Default Constructor
    public MedicalRecord() {

    }

    //Constructor with all parameters
    public MedicalRecord(Integer patientID, Boolean gender, Float height, Float weight, BloodType bloodType, Boolean rhFactor,
                         String hairColor, String eyeColor, Boolean badHabits, Boolean vaccination) {
        this.patientID = patientID;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.RhFactor = rhFactor;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.badHabits = badHabits;
        this.vaccination = vaccination;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Boolean getRhFactor() {
        return RhFactor;
    }

    public void setRhFactor(Boolean rhFactor) {
        RhFactor = rhFactor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Boolean getBadHabits() {
        return badHabits;
    }

    public void setBadHabits(Boolean badHabits) {
        this.badHabits = badHabits;
    }

    public Boolean getVaccination() {
        return vaccination;
    }

    public void setVaccination(Boolean vaccination) {
        this.vaccination = vaccination;
    }

    @Override
    public String toString() {
        return "\n" + "Второе задание" + "\n" +
                "Данные о пациенте" + "\n" +
                "ID пациента: " + patientID + "\n" +
                "Пол:" + (gender ? "Мужской" : "Женский") + "\n" +
                "Рост: " + height + "\n" +
                "Вес: " + weight + "\n" +
                "Группа крови: " + bloodType + "\n" +
                "Резус фактор: " + (RhFactor ? "Rh(+)" : "Rh(-)") + "\n" +
                "Цвет волос: " + hairColor + "\n" +
                "Цвет глаз: " + eyeColor + "\n" +
                "Вредные привычки: " + (badHabits ? "Имеются" : "Не имеются") + "\n" +
                "Прививки: " + (vaccination ? "Да" : "Нет");
    }
}
