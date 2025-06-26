package Home_Page;

import DAO.BankDB;
import Bussiness_Logic.InsufficientBalance;
import Bussiness_Logic.Operations;

import java.util.Scanner;

public class BankService {
    private Scanner sc = new Scanner(System.in);

    public void startBanking(BankDB bank) {
        System.out.println("\n--- Existing Users ---");
        bank.users();

        System.out.print("\nEnter your Account Number: ");
        int acctNo = sc.nextInt();

        if (bank.isUserExists(acctNo)) {
            bank.WelcomePage(acctNo);
        } else {
            System.out.print("Account doesn't exist. Create new account? (YES/NO): ");
            String res = sc.next();
            if (res.equalsIgnoreCase("YES")) {
                System.out.print("Enter your name: ");
                sc.nextLine();
                String name = sc.nextLine();
                bank.createUser(acctNo, name);
            } else {
                System.out.println("Exiting...");
                return;
            }
        }

        Operations ops = (Operations) bank;
        boolean running = true;
        while (running) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    ops.deposit();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    int amt = sc.nextInt();
                    try {
                        ops.withdraw(amt);
                    } catch (InsufficientBalance e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    ops.check_Balance();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
