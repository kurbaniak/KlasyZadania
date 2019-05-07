package BankAccountGucio;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener{


    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton taskButton1;
    private JButton taskButton2;
    private JButton taskButton3;
    private JButton taskButton4;

    public ButtonPanel() {

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout());
        taskButton1 = new JButton("Task 1");
        taskButton2 = new JButton("Task 2");
        taskButton3 = new JButton("Task 3");

        taskButton1.addActionListener(this);
        taskButton2.addActionListener(this);
        taskButton3.addActionListener(this);

        add(panel1, BorderLayout.NORTH);

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel1.add(taskButton1);
        panel1.add(taskButton2);
        panel1.add(taskButton3);


        JPanel panel2 = new JPanel();
        taskButton4 = new JButton("Close");
        panel2.add(taskButton4);
        add(panel2, BorderLayout.SOUTH);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == taskButton1)
            setBackground(Color.GREEN);

        else if(source == taskButton2)
            setBackground(Color.BLUE);

        else if(source == taskButton3)
            setBackground(Color.RED);

        else if(source == taskButton4)
            setBackground(Color.RED);

    }
}
