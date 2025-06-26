package Customers;

import Bussiness_Logic.InsufficientBalance;
import Bussiness_Logic.Operations;

public class AXIS extends Operations implements Bank {
    @Override
    public void display() {
        System.out.println("Displaying AXIS Account Info...");
    }

    @Override
    public void showUsers() {
        System.out.println("Displaying AXIS Users...");
    }
}
