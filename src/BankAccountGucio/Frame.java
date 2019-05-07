package BankAccountGucio;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        super("Test akcji");

        JPanel buttonPanel = new ButtonPanel2();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);



    }
}
