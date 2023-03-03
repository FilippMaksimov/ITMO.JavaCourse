package ITMO.JavaCourse.Lab03;

public class Tree {
    private String treeName;
    private Integer age;
    private Boolean isAlive;
    private Integer caseNo;
    public void Tree() {
        caseNo = 1;
    }
    public void Tree(String treeName, Integer age) {
        caseNo = 2;
        this.treeName = treeName;
        this.age = age;
    }
    public void Tree(String treeName, Integer age, Boolean isAlive) {
        caseNo = 3;
        this.treeName = treeName;
        this.age = age;
        this.isAlive = isAlive;
    }

    public void printTree() {
        switch (caseNo) {
            case 1: System.out.println("Пустой конструктор без параметров сработал");
            break;
            case 2: System.out.println("\n"+ "Tree name: " + treeName + "\n" +
                    "Age: " + age);
            break;
            case 3: System.out.println("\n" + "Tree name: " + treeName + "\n" +
                    "Age: " + age + "\n" +
                    "Is alive" + (isAlive ? "Yes": "No"));
            break;
            default: System.out.println("The method has not called");
        }
    }
}
