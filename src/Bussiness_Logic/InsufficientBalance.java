package Bussiness_Logic;

public class InsufficientBalance extends Exception {
    public InsufficientBalance(String message) {
        super(message);
    }
}