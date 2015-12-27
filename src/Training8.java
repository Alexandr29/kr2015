public class Training8 extends Account {
    private String accountType = "8 Trainings";
    private int training = 8;
    
   /**
     * @return the training
     */
    public int getTraining() {
        return training;
    }
    @Override
    public String toString(){
        return accountType;
    }
}
