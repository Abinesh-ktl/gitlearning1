package DAO;

public interface BankDB {
    void users();
    void WelcomePage(int acctNo);
    boolean isUserExists(int acctNo);
    void createUser(int acctNo, String name);
}
