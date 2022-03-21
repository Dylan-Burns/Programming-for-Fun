public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void getAccountNumber(){
        System.out.println("Account Number: " + accountNumber);
    }

    public void getBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getCustomerName() {
        System.out.println("Customer Name: " + customerName);
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void getEmail() {
        System.out.println("Customer Email: " + email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getPhoneNumber() {
        System.out.println("Customer Phone Number: " + phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit Amount: " + this.balance);
    }

    public void withdraw(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0) System.out.println("Insufficient Funds");
        this.balance -= withdrawalAmount;

    }

    public static void main(String[] args) {
        BankAccount dylanAccount = new BankAccount("12345", 0.00, "Dylan Burns", "dylanburns1524@gmail.com", "(619) 415-9870");
        dylanAccount.getAccountNumber();
        dylanAccount.getCustomerName();
        dylanAccount.getEmail();
        dylanAccount.getPhoneNumber();
        dylanAccount.getBalance();

        dylanAccount.deposit(100.0);
        dylanAccount.getBalance();
        dylanAccount.withdraw(50.0);
        dylanAccount.getBalance();
    }


}
