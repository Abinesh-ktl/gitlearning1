package DAO;

public class HDFC_DB extends BaseBankDB {

    public HDFC_DB() {
        super("HDFC Bank");
        users.put(5678, "Abinesh");
        users.put(5679, "Suresh");
        users.put(5680, "Nitish");
    }
}
