public class Card{
    private int value; 
    private String suit; 
    public Card(int value, String suit){
        this.value = value; 
        this.suit = suit; 
    }
    public String getSuit(){
        return this.suit; 
    }
        public int getValue(boolean isBlackJack){
            if (isBlackJack==true){
                if (value==1){
                    return 11;
                }
                else if ( value>10){
                    return 10; 
                }
                else{
                    return value; 
                }
            }
            else {
                return value; 
            }
    }
    public String declareCard(){
        String result = null; 
        if (this.value==11){
            result = "the jack of " + this.suit;
        }
        else if (this.value==12){
            result = "the queen of " + this.suit;
        } 
        else if (this.value==13){
            result = "the king of " + this.suit;
        } 
        else if (this.value==1){
            result = "the Ace of " + this.suit;
        }    
        else {
            result = "the " + this.value + " of " + this.suit;
        }                    
        return result; 
    }
}