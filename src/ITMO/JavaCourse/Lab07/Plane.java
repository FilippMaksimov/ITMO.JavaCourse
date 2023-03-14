package ITMO.JavaCourse.Lab07;

public class Plane {
    static class Wing {
        private Integer weight;

        public Wing(Integer weight) {
            this.weight = weight;
        }

        public void printWeight() {
            System.out.println("Вес крыла: " + weight + "кг.");
        }
    }

    public void printInfo(final Integer weight) {
        Wing wing = new Wing(weight);
        wing.printWeight();
    }
}
