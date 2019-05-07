package KontaBankowe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount1 {
    private int balance;
    public BankAccount1(int balance) {
        this.balance = balance;
    }
    //wywolanie klasy wewn standardowej
    public  class BalanceCounter implements ActionListener {

        public BalanceCounter(double interestRate) {
            this.interestRate = interestRate;
        }

        private double interestRate;
        @Override
        public void actionPerformed(ActionEvent e) {
            int newBalance = (int) (BankAccount1.this.balance + balance * interestRate);
            System.out.println("Changing account balance from " + balance + " to " + newBalance);
            BankAccount1.this.balance = newBalance;
        }
    }
}
