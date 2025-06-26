package Customers;

import Bussiness_Logic.InsufficientBalance;
import Bussiness_Logic.Operations;

public class SBI extends Operations implements Bank {
    @Override
    public void display() {
        System.out.println("Displaying SBI Account Info...");
    }

    @Override
    public void showUsers() {
        System.out.println("Displaying SBI Users...");
    }

   // Call the check_Balance method from the parent Operations class
    }

