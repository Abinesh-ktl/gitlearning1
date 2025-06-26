package DAO;

public class SBI_DB extends BaseBankDB {

    public SBI_DB() {
        super("SBI Bank");
        users.put(4321, "Deepak");
        users.put(4322, "Meena");
    }
}
