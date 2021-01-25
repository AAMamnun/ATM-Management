
package overdraft;

public class BankAccount {

    private String accName;
    private int cardNumber;
    private float balance;
    
    public BankAccount(int CardNumber, String AccName, int Balance){
	cardNumber = CardNumber;
	accName = AccName;
        balance= Balance;
    }

    public void deposit(float anAmount){
	if (anAmount>0.0){
            balance = balance + anAmount;
            System.out.println("\tBalance Deposited.");
        }
        
    }

    public void withdraw(float anAmount){
        if ((anAmount>0.0) && (balance>anAmount)){
            if (anAmount%500==0){
                balance = balance - anAmount;
                System.out.println("\tCollect the money");
            }
            else{
                System.out.println("\tMake your amount multiplier of 500");
            }
        }
        else{
            System.out.println("\tInsufficient Fund.");
        }
    }

    public float getBalance(){
	return balance;
    }
}
