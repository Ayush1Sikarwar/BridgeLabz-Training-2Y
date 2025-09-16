class Customer {
    String name;
    double balance;

    Customer(String n, double bal) {
        name = n; balance = bal;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String name;
    Bank(String n) { name = n; }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened an account in " + name);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Alice", 5000);
        Customer c2 = new Customer("Bob", 3000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
