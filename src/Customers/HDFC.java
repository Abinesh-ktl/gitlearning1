package Customers;

import Bussiness_Logic.InsufficientBalance;
import Bussiness_Logic.Operations;

public class HDFC extends Operations implements Bank {

    // Overriding the deposit method to prevent deposit in HDFC bank
    @Override
    public void deposit() {
        System.out.println("Deposit operation is not allowed in HDFC Bank.");
    }

    @Override
    public void display() {
        System.out.println("Displaying HDFC Account Info...");
    }

    @Override
    public void showUsers() {
        System.out.println("Displaying HDFC Users...");
    }
}
