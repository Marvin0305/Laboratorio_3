
package log;

import domain.Client;


public abstract class SavingAccount extends Account{
    
    private String startDate;
    private int monthNumber;
    private float interest;
    private String getInterest;

    public SavingAccount(String startDate, int monthNumber, float interest) {
        this.startDate = startDate;
        this.monthNumber = monthNumber;
        this.interest = interest;
    }

    public SavingAccount(String startDate, int monthNumber, float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.startDate = startDate;
        this.monthNumber = monthNumber;
        this.interest = interest;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    
    

    @Override
    public void deposit(double amount) {
        
        super.setBalance(interestCalculation()+ amount);
    }

    @Override
    public void withdraw(double amount) {
    
        super.setBalance(interestCalculation()-amount);
    }

    @Override
    public double interestCalculation(){
    
        double interestTotal = 0;
        interestTotal = this.getMonthNumber()
                +super.getBalance()
                +this.getInterest();
        return super.getBalance()+ interestTotal;
        
    }

    @Override
    public String toString() {
        
        String result = "\n Account type: Saving Account: "
                + "\n_________________________________________________"
                + "\n Saving Start Date: " + this.getStartDate()
                + "\n Months: " +this.getMonthNumber()
                + "\n Interest: " +this.getInterest
                + "\n Interest you got: "+
                (this.getMonthNumber()
                +super.getBalance()
                +this.getInterest());
                
        return result;
    }

   
    
    
    
    
    
}
