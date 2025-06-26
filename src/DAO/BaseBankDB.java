package DAO;

import Bussiness_Logic.Operations;
import java.util.HashMap;

public abstract class BaseBankDB extends Operations implements BankDB {

    protected HashMap<Integer, String> users = new HashMap<>();
    protected String bankName;

    public BaseBankDB(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void users() {
        for (int key : users.keySet()) {
            System.out.println("Account No: " + key + " Name: " + users.get(key));
        }
    }

    @Override
    public void WelcomePage(int acctNo) {
        System.out.println("Welcome to " + bankName + ", " + users.get(acctNo));
    }

    @Override
    public boolean isUserExists(int acctNo) {
        return users.containsKey(acctNo);
    }

    @Override
    public void createUser(int acctNo, String name) {
        users.put(acctNo, name);
        System.out.println("Account created in " + bankName + " for: " + name);
    }
}
