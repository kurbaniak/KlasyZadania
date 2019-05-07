package KontaBankowe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount2 {
    private int balance;
    public BankAccount2(int balance) {
        this.balance = balance;
    }
    //wywolanie klasy wewn lokalnej
    public ActionListener createBalanceCounter(double interestRate) {
        class BalanceCounter implements ActionListener {
            double interestRate;
            public BalanceCounter(double interestRate) {
                this.interestRate = interestRate;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                int newBalance = (int) (BankAccount2.this.balance + balance * interestRate);
                System.out.println("(2) Changing account balance from " + balance + " to " + newBalance);
                BankAccount2.this.balance = newBalance;
            }
        }
        return new BalanceCounter(interestRate);
    }
}
