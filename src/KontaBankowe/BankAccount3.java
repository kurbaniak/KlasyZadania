package KontaBankowe;

import java.awt.event.ActionListener;

public class BankAccount3 {
    private int balance;
    private double interestRate;
    public BankAccount3(int balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    //klasa anonimowa
    public ActionListener createBalanseCOunter() {
        return e ->  {
            int newBalance = (int) (BankAccount3.this.balance + balance * interestRate);
            System.out.println("Changing account balance from " + balance + " to " + newBalance);
            BankAccount3.this.balance = newBalance;
        };
    }
}
