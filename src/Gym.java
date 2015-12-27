
import java.util.ArrayList;


public class Gym {
    
    public Gym(){
        
    }
    
    ArrayList<Customer> customers = new ArrayList<Customer>();
    
    
    
    void addCustomer(Customer customer){
        customers.add(customer);
    }
    
    Customer getСustomer(int account){
        return customers.get(account);
    }
    
    ArrayList<Customer> getCustomers(){
     return customers;   
    }

    Customer getCustomerByAcoountNumber(int accountNumber) {
        Customer customer = null;
        for(Customer c : customers){
            if(c.getAccount().getAccountNumber()==accountNumber){
                customer = c;
                break;
            }
        }
        return customer;
    }

    void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
   
    
}
