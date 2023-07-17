import java.util.Scanner;  
public class HighLowGame{
    
public static void main(String[] args){
    Deck deck = new Deck();
    Scanner sc = new Scanner(System.in);
    Card card1 = deck.drawCard();
    System.out.println("The first card is " + card1.declareCard());
    System.out.println("Will the next card be higer or lower? ( 1 for higher, 2 for lower)");
    int choice = sc.nextInt(); 
    sc.close();
        Card card2 = deck.drawCard(); 
    System.out.println("The nex Card is" + card2.declareCard()); 
    boolean higher = card2.getValue(false)>card1.getValue(false);
    if(card1.getValue(false) == card2.getValue(false)){
        System.out.println("They are equal");
    }
    else if((higher&&choice == 1 ) || (!higher && choice == 2)){
        System.out.println("U win");
    }
    else{
        System.out.println("Loser");
    }
    
}
}