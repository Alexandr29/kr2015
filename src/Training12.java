public class Training12 extends Account {
  private String accountType = "12 Trainings";
  private int training = 12;
    
   
    
    @Override
    public String toString(){
        return accountType;
    }   

    /**
     * @return the training
     */
    public int getTraining() {
        return training;
    }
}