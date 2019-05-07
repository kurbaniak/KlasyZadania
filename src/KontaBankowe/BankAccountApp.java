package KontaBankowe;

import sun.font.BidiUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class BankAccountApp {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();

    }

    public static void task1() {
        initWindow();
        BankAccount1 account = new BankAccount1(100);
        BankAccount1.BalanceCounter counter = account.new BalanceCounter(0.20);
        Timer timer = new Timer(1000, counter);
        timer.setInitialDelay(0);
        timer.start();

    }
    public static void task2(){
        initWindow();
        BankAccount2 account2 = new BankAccount2(10);
        Timer timer = new Timer(1000, account2.createBalanceCounter(2));
        timer.setInitialDelay(0);
        timer.start();

    }
public static void task3(){

        BankAccount3 account3 = new BankAccount3(100, 2);
        Timer timer = new Timer(1000, account3.createBalanseCOunter());
        timer.setInitialDelay(0);
        timer.start();

}

public static void initWindow(){
    JFrame frame = new JFrame("BankAccount");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton button = new JButton("Close");
   // JButton button2 = new JButton("Text");
    JTextField field = new JPasswordField();




    //ponizsze wyrazenie lambda jest rownowazne zkomentowanej metodzie
    button.addActionListener(e -> frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)));

    /*
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    });
*/

   /* button2.addActionListener(e ->
            field.setText("Hello Word")
            );*/

    button.setBounds(20, 20, 150, 150);
    button.setMargin(new Insets(10, 10, 10, 10));
    frame.getContentPane().add(button);
   // frame.getContentPane().add(button2);
    frame.getContentPane().add(field);
    frame.pack();
    frame.setLocationRelativeTo(null);
   // frame.getContentPane().setBounds(100, 100, 100, 100);
    frame.setVisible(true);
}

}


