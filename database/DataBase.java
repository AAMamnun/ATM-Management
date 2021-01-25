
package database;

public class DataBase {
    private int cardNumber, pinNumber, bal;
    private String accName;
    private boolean bool;
    
    public DataBase(int cardN, int pinN){
        cardNumber= cardN;
        pinNumber= pinN;
        cardData();
    }
    
    public void cardData(){
        String [][] card={
            {"123","321", "Mamnun", "3210"},
            {"456","654", "Abdullah", "94621"},
            {"789","987", "Diya", "9871"}
        };
    
        int i;
        for(i=0; i<card.length; i++){
            if(Integer.parseInt(card[i][0])==cardNumber){
                if(Integer.parseInt(card[i][1])==pinNumber){
                    accName= card[i][2];
                    bal= Integer.parseInt(card[i][3]);
                    bool= true;
                }
                else{
                    bool= false;
                }
                break;
            }
            else{
                bool= false;
            }
        }
    
        
    }
    
    public boolean getBool(){
        return bool;
    }
    
    public int getCardNumber(){
        return cardNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public String getAccName(){
        return accName;
    }
    public int getBalance(){
        return bal;
    }
}
