package BankAccountGucio;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel2 extends JPanel{

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton taskButton1;
    private JButton taskButton2;
    private JButton taskButton3;
    private JButton taskButton4;

    private JPanel buttonPanel;

    public ButtonPanel2() {

        taskButton1 = new TaskButton1();
        taskButton2 = new TaskButton2();
        taskButton3 = new TaskButton3();
        taskButton4 = new TaskButton4();

        buttonPanel = this;

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(taskButton1);
        add(taskButton2);
        add(taskButton3);
        add(taskButton4);
    }

    class TaskButton1 extends JButton implements ActionListener {

        TaskButton1() {
            super("Task 1");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(Color.GREEN);
        }
    }

    class TaskButton2 extends JButton implements ActionListener {

        TaskButton2() {
            super("Task 2");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(Color.BLUE);
        }
    }

    class TaskButton3 extends JButton implements ActionListener {

        TaskButton3() {
            super("Task 3");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(Color.RED);
        }
    }

    class TaskButton4 extends JButton implements ActionListener {

        TaskButton4() {
            super("Task 4");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(Color.BLACK);
        }
    }

}