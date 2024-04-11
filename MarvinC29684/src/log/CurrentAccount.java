package log;

import domain.Client;

public class CurrentAccount extends Account {

    private int limit;

    public CurrentAccount(String accountNumber, double balance, Client client, int Limit) {
        super(accountNumber, balance, client);
        this.limit = Limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int Limit) {
        this.limit = Limit;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance() - amount);
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = super.getBalance() + limit;
        if (amount <= availableBalance) {
            super.setBalance(super.getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double interestCalculation() {
        return 0;
    }

    @Override
    public String toString() {
        String result = "\n Account type: Current Account"
                + "\n ________________________________________________"
                + "\n Overdraft Limit: " + this.limit 
                + "\n Account Number: " + this.getAccountNumber()
                + "\n Balance: " + this.getBalance()
                + "\n Account Owner: " + this.getClient().getName();
        return result;
    }
    
    

}
