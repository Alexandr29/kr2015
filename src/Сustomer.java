
public class Сustomer {

    private String firstName;
    private String lastName;
    private Account account;
  
    Сustomer(String firstName, String lastName, Account account){
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
    
}
