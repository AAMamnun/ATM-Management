
package overdraft;

public class OverdraftAccount extends BankAccount{
    private float overdraftLimit;

    public OverdraftAccount(int CardNumber, String AccName, int Balance, int Limit){
        super(CardNumber, AccName, Balance);
		overdraftLimit = Limit;
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }
    
    public void checkLimit(float anAmount){
        if ((anAmount>0.0) && (overdraftLimit>=anAmount)){
            withdraw(anAmount);
        }
        else{
            System.out.println("\tLimit crossed");
        }
    }


}