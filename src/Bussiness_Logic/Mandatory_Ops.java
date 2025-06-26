package Bussiness_Logic;

public interface Mandatory_Ops {
    void deposit();
    void withdraw(int Amt) throws InsufficientBalance;
    void check_Balance();
}