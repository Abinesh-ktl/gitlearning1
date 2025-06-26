package Home_Page;

import DAO.BankDB;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Bank: 1. AXIS  2. HDFC  3. SBI");
        int choice = sc.nextInt();

        BankDB bank = BankFactory.getBank(choice);

        BankService service = new BankService();
        service.startBanking(bank);
    }
}
