public class User_Account {
    private String email;
    private String name;
    private long phone;
    private String accountNumber;

    public User_Account(String email, String name, long phone, String accountNumber) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.accountNumber = accountNumber;
    }

    public void display() {
        System.out.println("User Profile:");
        System.out.println("Email: " + email);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Account Number: " + accountNumber);
    }
}
