public class Deck{
    public Card drawCard(){
        int suitInt = (int) (Math.random()*4+1);
        int valueInt = (int) (Math.random()*13+1);
        String suit = null;
        if (suitInt==1){
            suit = "Spade";
        }
        else if(suitInt==2){
            suit = "Heart";
        }
        else if(suitInt==3){
            suit = "Clubs";
        }
        else{
            suit = "Diamonds";
        }
        Card card = new Card(valueInt, suit);
        return card; 
    }
}