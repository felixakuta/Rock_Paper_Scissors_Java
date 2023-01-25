//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        int rock = 0;
//        int paper = 1;
//        int scissor = 2;
//
//        boolean replay = true;
//        while (replay == true) {
//            int randomValue = (int) (Math.random() * 3);
//
//            Scanner forRock = new Scanner(System.in);
//            System.out.print("What do you choose? ");
//            int userInput = Integer.parseInt(forRock.nextLine());
//            System.out.println(randomValue + " Computer value and " + userInput + " user value.");
//
//            if (randomValue == userInput) {
//                System.out.println("draw");
//            } else if (userInput == rock && randomValue == scissor) {
//                System.out.println("you win");
//            } else if (userInput == paper && randomValue == rock) {
//                System.out.println("you win");
//            } else if (userInput == scissor && randomValue == paper) {
//                System.out.println("you win");
//            } else {
//                System.out.println("computer wins");
//            }
//            System.out.println("Do you wish to play again? if yes select 1 if no select 2: ");
//            int userInput1 = Integer.parseInt(forRock.nextLine());
//            if (userInput1 == 1) {
//                replay = true;
//            } else if (userInput1 == 2) {
//                replay = false;
//            }
//        }
//    }
//
//}
import java.util.Scanner;

public class Main {
    //I declared variable and assigned values to each of them
    static int rock = 0;
    static  int paper = 1;
    static int scissors = 2;

    public static void main(String[] args){
        Scanner result = new Scanner(System.in);
        //I set a true || false condition then looped through in other for the user to either repeat the game or end it
        boolean replay = true;
        while(replay == true){
            //I declared a random value to enable the computer or the user have multiple choice of numbers between 0
            // and 1
            int randomValue = (int)(Math.random() * 3);
            // I created a new object where data is received from user
            System.out.println("Choose either 0, 1, or 3");
            // I created a variable and set a method to covert the string value to integer
            int userInput = Integer.parseInt(result.nextLine());
            System.out.println(randomValue + " Computer value and " + userInput + " user value.");

            if (randomValue ==  userInput){
                System.out.println("draw");
            } else if(userInput == rock && randomValue == scissors ) {
                System.out.println("you win");
            } else if (userInput == paper && randomValue == rock){
                System.out.println("you win");
            } else if (userInput == scissors && randomValue == paper) {
                System.out.println("you win");
            }
            else {
                System.out.println("computer wins");
            }
            System.out.println("Do you wish to continue? enter 1 if yes or enter 2 if no ");
            int userInput1 = Integer.parseInt(result.nextLine());
            if (userInput1 == 1) {
                replay = true;
            } else if (userInput1 == 2) {
                replay = false;
            }
        }

    }

}





