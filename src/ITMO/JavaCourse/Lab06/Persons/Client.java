package ITMO.JavaCourse.Lab06.Persons;

public class Client extends Person {
    private String bankName;
    private String head = "Название банка: ";
    private Float[] deposit;
    private Float[] withdraws;

    public Client(String name, String lastname, String bankName, Float[] deposit, Float[] withdraws) {
        super(name, lastname);
        this.bankName = bankName;
        this.withdraws = withdraws;
        this.deposit = deposit;
    }

    @Override
    public void getInfo() {
        System.out.println(TITLE);
        System.out.println(head + bankName);
        System.out.println(printStatus());
        System.out.println(getName() + " " + getLastname());
        personDetails();
    }

    @Override
    public String printStatus() {
        return "Client";
    }

    @Override
    public void personDetails() {
        StringBuilder topUpHistory = new StringBuilder("Deposit History (USD): ");
        StringBuilder withdrawHistory = new StringBuilder("Withdraw History (USD): ");
        float balance = 0;
        for (float topUp : deposit) {
            topUpHistory.append(topUp).append(", ");
            balance += topUp;
        }
        for (float withdraw : withdraws) {
            withdrawHistory.append(withdraw).append(", ");
            balance -= withdraw;
        }
        System.out.println(topUpHistory);
        System.out.println(withdrawHistory);
        System.out.println("Balance: " + balance);
    }
}
