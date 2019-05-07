package KontaBankowe;

import java.awt.*;

public class BankAccountFrameApp {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankAccountFrame("Bank 'gucio'");
            }
        });
    }
}
