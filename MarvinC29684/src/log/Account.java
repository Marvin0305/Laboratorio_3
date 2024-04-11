
package log;

import domain.Client;


public  abstract class Account {
    private String accountNumber;
    private double balance;
    private Client client;

    public Account() {
    }

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation();

    @Override
    public String toString() {
        String result = "\n Bank Account Information: "
                + "\n ______________________________________________"
                + "\n Account Number: " + this.getAccountNumber()
                + "\n Balance: " +this.getBalance()
                + "\n Acoount Owner: " +this.getClient().toString();
        return result;
    }
    
    
    
    
    
}
