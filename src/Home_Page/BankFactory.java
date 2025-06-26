package Home_Page;

import DAO.*;

public class BankFactory {
    public static BankDB getBank(int choice) {
        switch (choice) {
            case 1:
                return new AXIS_DB();
            case 2:
                return new HDFC_DB();
            case 3:
                return new SBI_DB();
            default:
                return null;
        }
    }
}
