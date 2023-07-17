import java.util.Scanner;  

public class Blackjack{
public static void main(String[] args){
    Deck deck = new Deck(); 
    int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true); 
    int playerTotal = deck.drawCard().getValue(true)+ deck.drawCard().getValue(true); 
    Scanner sc = new Scanner(System.in);

    while (playerTotal<21){
        System.out.println("your total is: "+ playerTotal);
        System.out.println("Do you wish to continue ( 1 for yes, 0 for no)");
        int choice = sc.nextInt();
        if (choice == 0){
            break; 
        }
        else if (choice ==1){
            Card nextCard = deck.drawCard(); 
           playerTotal+= nextCard.getValue(true);
        }
        else {
            System.out.println("Wrong input");
        }
    }
    if(playerTotal>21){
        System.out.println("Busted"); 
    } 
    else {
        System.out.println("Player stays with "+ playerTotal); 
        int loopCount=0; 
        while (loopCount==0){
            System.out.println("Your total is " + houseTotal); 
            if (houseTotal<17){
                System.out.println("Continue to hit"); 
               Card nextCard = deck.drawCard(); 
                houseTotal +=nextCard.getValue(true); 
            }
            else if (houseTotal<21&& houseTotal>17){
            System.out.println("Do you wish to continue (1 for yes 0 for no)");
            int choice2 = sc.nextInt(); 
            if (choice2 ==1 ){
                Card nextCard = deck.drawCard(); 
                houseTotal +=nextCard.getValue(true); 
            } 
            else if (choice2==0){
                System.out.println("Your total is " + houseTotal); 
                ++loopCount;                 

            }
            else {
                System.out.println("Invalid"); 
            }
            }
            else {
                System.out.println("Busted"); 
                ++loopCount; 
            }

        }
    }
    if (houseTotal>21){
        System.out.println("Player wins"); 
    }
    else if (houseTotal>playerTotal){
        System.out.println("House wins"); 
    }
    else if (playerTotal==houseTotal){
    System.out.println("They tie");
    }
    else if(playerTotal>houseTotal){
        System.out.println("Player wins"); 
    }
}
}