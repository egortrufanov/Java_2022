package lab2;


record Customer(int id, String surname, String name) { }

class Account {
    public Account(Customer customer, double balance) {
        this.customer = customer;
//        this.balance = 0;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double fee){
        balance += fee;
    }
    public boolean withdraw(double withdrawal){
        if (withdrawal > balance) return false;
        balance -= withdrawal;
        return true;
    }
    public int getCustomer(){
        return customer.id();
    }
    public String getDetails(){
        return String.format(
                "Surname: %s\nName: %s\nBalance: %.2f",
                customer.surname(), customer.name(), balance);
    }

    private final Customer customer;
    private double balance;

//    public static void main(String[] args){
//        Customer customer = new Customer(0, "Trufanov", "Egor");
//        Account account = new Account(customer);
//        account.deposit(30.9);
//        if(account.withdraw(30)) System.out.println("Withdrawal completed");
//        else System.out.println("Not enough money");
//        System.out.printf("Customer id: %s\n", account.getCustomer());
//        System.out.printf("Balance: %.2f\n", account.getBalance());
//        System.out.printf("Details: \n%s\n", account.getDetails());
//    }
}

class ATM{
    static public void out(Account account){
        System.out.printf("Details: \n%s\n", account.getDetails());
    }
}

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer(0, "Trufanov", "Egor");
        Account account = new Account(customer, 30.9);

        account.deposit(30);
        ATM.out(account);
    }
}
