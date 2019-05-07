package KontaBankowe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccountFrame extends JFrame {


    public BankAccountFrame(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocation(50, 50);



        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout());
        JButton button1 = new JButton("Task 1");
        JButton button2 = new JButton("Task 2");
        JButton button3 = new JButton("Task 3");

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);


        getContentPane().add(panel1, BorderLayout.NORTH);

       JPanel panel2 = new JPanel();
       JButton button4 = new JButton("Task 4");
        panel2.add(button4);

        getContentPane().add(panel2, BorderLayout.SOUTH);


        //setResizable(false);
        setVisible(true);
    }


}
