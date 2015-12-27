
public class Account {
    
    private double used = 0;
    private double balance = 0;
    private int accountNumber;
    private static int numberOfAccounts = 1000000;
    
    Account(){
        accountNumber = numberOfAccounts++;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance=balance;
    }


   
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void useActivity(double amount){
    if (amount < getUsed()){
        System.out.println("You have insufficient Activity");
        return;
        }   
    System.out.println("Balance: "+ getUsed());
    
    }

    /**
     * @return the used
     */
    public double getUsed() {
        return used;
    }

    /**
     * @param used the used to set
     */
    public void setUsed(double used) {
        this.used = used;
    }


    
}
