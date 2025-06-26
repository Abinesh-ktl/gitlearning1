package DAO;

public class AXIS_DB extends BaseBankDB {

    public AXIS_DB() {
        super("Axis Bank");
        users.put(1234, "Amit");
        users.put(1235, "Rohit");
    }
}
