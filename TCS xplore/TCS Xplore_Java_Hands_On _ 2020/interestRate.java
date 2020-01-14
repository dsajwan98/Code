import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int id = s.nextInt();
        double balance=s.nextDouble();
        double interestRate=s.nextDouble();
        int noOfYears=s.nextInt();
        s.close();
        Account acc=new Account(id, balance, interestRate);
        double amount=calculateInterest(acc, noOfYears);
        System.out.format("%.3f",amount);
    }
    public static double calculateInterest(Account acc, int noOfYears){
        double temp = noOfYears * acc.getInterestRate() / 100;
        return (acc.getBalance() * (acc.getInterestRate()+temp) / 100);
    }
}

class Account{
    int id;
    double balance;
    double interestRate;
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    /**
     * @return the interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }
    Account(int id, double balance, double interestRate){
        this.setId(id);
        this.setBalance(balance);
        this.setInterestRate(interestRate);
    }
}