import java.util.Scanner;

public class CandleShop {

    public static void main(String[] args) {

        System.out.println("*******************************");
        System.out.println("Project 3");
        System.out.println("*******************************");
        // Add code here
        System.out.println("Welcome to the candle storage program");
        int burn = 0; // an integer to store the burn time  
        String name = "X"; // a string to store the name  
        int type = 0; // an integer to store the type  
        double cost = 0; // a double to store the cost 
        Scanner scan = new Scanner(System. in);
        int temp = 0; // a value to hold the type that was entered by the user to make sure that he doesn't choose the same thing 2 times
        Candle first = new Candle(name, type, cost, burn);
        Candle second = new Candle(name, type, cost, burn);
        Candle third = new Candle(name, type, cost, burn);
        int typeInput = 0; // the type of candles that the customer entered
        int numOfInputs = 0; // how many candles the customer want
        double totalPrice = 0;//calculate the total price
        char choice = 'm'; // to let the user choose betweeen yes/no
        int totalburn = 0; // total time for burning
        int cOneCounter = 0; // calculate the total amount of canldes of type 1
        int cOneTemp = 0;// hold the amount of candles from the counter variable type 1
        int cTwoCounter = 0;// calculate the total amount of canldes of type 2
        int cTwoTemp = 0; // hold the amount of candles from the counter variable type 2
        int cThreeCounter = 0;// calculate the total amount of canldes of type 3
        int cThreeTemp = 0;// hold the amount of candles from the counter variable type 3
        int loop_count = 0;
        while (loop_count == 0) { 

            System.out.println("Please enter the type that you want (1/2/3)");
            type = scan.nextInt();
            temp = type; // Store the type of the candle in order to not repeat the same input
            if (type == 1 || type == 2 || type == 3) { //check if the input is between 1-3

                ++loop_count; // get out of the loop

            } else {
                System.out.println("Your input is wrong please reinput");
            }
        }
        System.out.println("Please enter the burntime of candle " + type);
        burn = scan.nextInt();
        System.out.println("Please enter the cost of candle " + type);
        cost = scan.nextDouble();
        System.out.println("Please enter the name of candle " + type);
        scan.nextLine();//clear the buffer
        name = scan.nextLine();

        if (type == 1) { // set the parameters of the first type
            first.setName(name);
            first.setType(type);
            first.setCost(cost);
            first.setTime(burn);
        } else if (type == 2) {// set the parameters of the second type
            second.setName(name);
            second.setType(type);
            second.setCost(cost);
            second.setTime(burn);
        } else {// set the parameters of the third type
            third.setName(name);
            third.setType(type);
            third.setCost(cost);
            third.setTime(burn);
        }
        while (loop_count == 1) {

            System.out.println("Please enter the type that you want (1/2/3)");
            type = scan.nextInt();
            if (temp == type) {
                System.out.println("you can't enter the same value two times, please reinput");
            } else if (type == 1 || type == 2 || type == 3) {
                ++loop_count;

            } else {
                System.out.println("Your input is wrong please reinput");
            }
        }
        System.out.println("Please enter the burntime of candle " + type);
        burn = scan.nextInt();
        System.out.println("Please enter the cost of candle " + type);
        cost = scan.nextDouble();
        System.out.println("Please enter the name of candle " + type);
        scan.nextLine();
        name = scan.nextLine();


        if (type == 1) {
            first.setName(name);
            first.setType(type);
            first.setCost(cost);
            first.setTime(burn);
        } else if (type == 2) {
            second.setName(name);
            second.setType(type);
            second.setCost(cost);
            second.setTime(burn);
        } else {
            third.setName(name);
            third.setType(type);
            third.setCost(cost);
            third.setTime(burn);
        }
        while (loop_count == 2) {

            System.out.println("Please enter the type that you want (1/2/3)");
            type = scan.nextInt();
            if (temp == type) {
                System.out.println("you can't enter the same value two times, please reinput");
            } else if (type == 1 || type == 2 || type == 3) {
                ++loop_count;

            } else {
                System.out.println("Your input is wrong please reinput");
            }
        }
        System.out.println("Please enter the burntime of candle " + type);
        burn = scan.nextInt();
        System.out.println("Please enter the cost of candle " + type);
        cost = scan.nextDouble();
        System.out.println("Please enter the name of candle " + type);
        scan.nextLine();
        name = scan.nextLine();


        if (type == 1) {
            first.setName(name);
            first.setType(type);
            first.setCost(cost);
            first.setTime(burn);
        } else if (type == 2) {
            second.setName(name);
            second.setType(type);
            second.setCost(cost);
            second.setTime(burn);
        } else {
            third.setName(name);
            third.setType(type);
            third.setCost(cost);
            third.setTime(burn);
        }

        System.out.println("Welcome customer");
        do {
            System.out.println("Choose the type of candle you want 1-2-3");
            int x = 0;
            while (x == 0) { // don't get out of the loop except if the customer entered 1-3
                typeInput = scan.nextInt();
                if (typeInput == 1 || typeInput == 2 || typeInput == 3) {
                    ++x;
                } else {
                    x = 0;
                    System.out.println("Wrong input please reinput");
                }
            }
            System.out.println("Choose the amount of candles you want");
            numOfInputs = scan.nextInt();
            int loopCounter = 0; // a counter that will keep looping to calculate total price
            if (typeInput == 1) {
                while (loopCounter != numOfInputs) {
                    totalPrice = first.getCost() + totalPrice; //keep adding total price using getter
                    totalburn = first.getTime() + totalburn; // keep adding total burn using getter
                    ++loopCounter;
                    cOneCounter = loopCounter; // set the value of the counter of the candle to the loop counter to calculate how many candles he ordered
                }
                loopCounter = 0;//reset the loop counter in order to recount
            }
            if (typeInput == 2) {
                while (loopCounter != numOfInputs) {
                    totalPrice = second.getCost() + totalPrice;
                    totalburn = second.getTime() + totalburn;
                    ++loopCounter;
                    cTwoCounter = loopCounter;

                }
                loopCounter = 0;
            }
            if (typeInput == 3) {
                while (loopCounter != numOfInputs) {
                    totalPrice = third.getCost() + totalPrice;
                    totalburn = second.getTime() + totalburn;
                    ++loopCounter;
                    cThreeCounter = loopCounter;

                }
                loopCounter = 0;
            }
            // The temp value is the value that has the total amount of candles because it adds to itself
            cOneTemp += cOneCounter; 
            cThreeTemp += cThreeCounter;
            cTwoTemp += cTwoCounter;

            System.out.println("Are you done y/n");
            int y = 0;
            while (y == 0) { // make sure that the customer entered the right value
                choice = scan.next().charAt(0); 
                if (choice == 'n' || choice == 'N' || choice == 'y' || choice == 'Y') {//check for the right value

                    ++y;
                } else {
                    System.out.println("Wrong input please reinput");
                }
            }
        } while (choice == 'n' || choice == 'N'); //don't get out as long as the user enter 'n' or 'N' because this meanns that he is not done
        System.out.println("Your total cost is: " + totalPrice + '$');//display total price
        //Maths operations for the discount
        if (totalPrice > 20 && totalPrice <= 35) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        } else if (totalPrice > 35 && totalPrice <= 55) {
            totalPrice = totalPrice - (totalPrice * 0.07);
        } else if (totalPrice > 55 && totalPrice <= 100) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        } else if (totalPrice > 100) {
            totalPrice = totalPrice - (totalPrice * 0.20);

        } else {
            totalPrice = totalPrice;
        }
        System.out.println(
            "Your total cost after the discount is: " + totalPrice + '$'
        );
        System.out.println(
            "Your total burn time for all the candles is: " + totalburn
        );
        double costPerMinute = totalPrice / totalburn;
        System.out.println(
            "Your total cost per minute for the candles to burn is :  " + costPerMinute
        );

        for (int i=0; i<1; ++i){ // nested for loop to print the stars according to the number of candles and print the statement for the total amount one time ( repeated for each type)
            System.out.print(cOneTemp+ " type (" + first.getName() + ") candles: " );
            for (int stars1=0; stars1<cOneTemp ; ++ stars1){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<1 ;++i){ // nested for loop to print the stars according to the number of candles and print the statement for the total amount one time ( repeated for each type)
            System.out.print(cOneTemp+ " type (" + second.getName() + ") candles: " );
            for (int stars2=0; stars2<cTwoTemp ; ++ stars2){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<1 ;++i){ // nested for loop to print the stars according to the number of candles and print the statement for the total amount one time ( repeated for each type)
            System.out.print(cThreeTemp+ " type (" + third.getName() + ") candles: " );
            for (int stars3=0; stars3<cOneTemp ; ++ stars3){
                System.out.print("*");
            }
            System.out.println();
        }
       




    } //end main
} // end class