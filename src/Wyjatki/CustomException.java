package Wyjatki;

public class CustomException extends Exception {

    @Override
    public String getMessage() {
        return "Brak środków na koncie";
    }
}
