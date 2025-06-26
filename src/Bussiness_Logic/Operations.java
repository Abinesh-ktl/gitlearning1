package Bussiness_Logic;

import java.util.Scanner;

public class Operations implements Mandatory_Ops {

    int Five_hundred;
    int Two_hundred;
    int Hundred;
    int balance = 0;
    Scanner sc = new Scanner(System.in);

    public void deposit() {
        System.out.println("Enter how many notes you have in 500, 200, 100!!");
        System.out.println("Enter how many 500 notes :");
        Five_hundred= sc.nextInt();
        System.out.println("Enter how many 200 notes :");
        Two_hundred=sc.nextInt();
        System.out.println("Enter how many 100 notes :");
        Hundred=sc.nextInt();
        sc.nextLine();

        int sum = 500 * Five_hundred + 200 * Two_hundred + 100 * Hundred;
        System.out.println("500 notes: " + Five_hundred);
        System.out.println("200 notes: " + Two_hundred);
        System.out.println("100 notes: " + Hundred);
        System.out.println("Total Amount: ₹" + sum);

        System.out.print("Confirm (YES/NO): ");
        String reply = sc.nextLine();
        if (reply.equals("YES")) {
            balance += sum;
            System.out.println("Amount Deposited Successfully. Current balance: ₹" + balance);
        } else {
            System.out.println("Deposit Failed or Cancelled");
        }
    }

    public void withdraw(int Amt) throws InsufficientBalance {
        if (Amt > balance) {
            throw new InsufficientBalance("Insufficient Balance");
        }

        int originalAmt = Amt;
        int num500 = 0, num200 = 0, num100 = 0;
        if (Amt >= 500) {
            num500 = Amt / 500;
            Amt %= 500;
        }
        if (Amt >= 200) {
            num200 = Amt / 200;
            Amt %= 200;
        }
        if (Amt >= 100) {
            num100 = Amt / 100;
            Amt %= 100;
        }

        System.out.println("Splitting of Notes:");
        System.out.println("500 notes: " + num500);
        System.out.println("200 notes: " + num200);
        System.out.println("100 notes: " + num100);

        System.out.print("Confirm withdrawal (YES/NO): ");
        String reply = sc.nextLine();

        if (reply.equals("YES")) {
            balance -= originalAmt;
            System.out.println("Amount: ₹" + originalAmt + " successfully withdrawn.");
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Withdrawal Cancelled.");
        }
    }

    public void check_Balance() {
        System.out.println("Current Balance: ₹" + balance);
    }


    }

