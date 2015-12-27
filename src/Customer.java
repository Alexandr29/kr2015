
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;
    private Training4 training4;
  
    Customer(String firstName, String lastName, Account account){
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }
    
    @Override
    public String toString(){
        return "\nCustomer information\n "+"First name" + getFirstName()+"\n"+
                " Last name" + getLastName()+"\n"+
                "account "+ getAccount();
    }
    
    public String basicInfo(){
        return "\nCustomer information\n "+"First name" + getFirstName()+
                " Last name" + getLastName()+
                "account "+ getAccount().getAccountNumber();
    }
    
     Account getAccount(){
        return account;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * @return the training4
     */
    public Training4 getTraining4() {
        return training4;
    }

    /**
     * @param training4 the training4 to set
     */
    public void setTraining4(Training4 training4) {
        this.training4 = training4;
    }
    
}
