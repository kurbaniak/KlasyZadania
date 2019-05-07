package Wyjatki;

public class CustomExceptionApp {

    private double amount;

    public void wplata(double money){
        amount = amount + money;
    }

    public void wyplata(double money){

    }

    public CustomExceptionApp() {
        amount = 0;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
