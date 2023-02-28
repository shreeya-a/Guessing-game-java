import java.util.Random;
import java.util.Scanner;



    public class GuessingGame {
        public static void main(String[] args) {
            System.out.println("\n-------------------------------------");
            System.out.println("\tWelcome to Guessing Game");
            System.out.println("-------------------------------------");
            System.out.println("-The system has picked a number between 1-10");
            System.out.println("-Guess the correct number to win!!!");
            System.out.println("-You will have 5 turns.");
            System.out.println("-Let us begin.");
            System.out.println("-------------------------------------");

            Scanner scannerObj = new Scanner(System.in);
            int[] guess = new int[5];
            // int min=1;
            // int max = 10;
            // int randomNumber = (int) (Math.random()*(max-min)) + min;
            // System.out.println("randomNumber" + randomNumber);
            Random randomObj = new Random();
            int randomNum = (randomObj.nextInt(10) + 1);
            // System.out.println("randomObj = "+ randomNum);


            for (int i = 0; i < 5; i++) {
                System.out.print("Enter guess " + (i + 1) + ": ");
                guess[i] = scannerObj.nextInt();
                int check = guess[i];
                boolean toCheck = false;
                for (int j = 0; j < i; j++) {
                    if (check == guess[j]) {
                        System.out.println("-Previously guessed. Pick a different number");
                        toCheck = true;
//                        i--;
                        System.out.println("--"+((5 - (i + 1))) + " guess left.\n");
                        break;

                    }
                }
//                if (toCheck== false){
                if (!toCheck){

                    if (guess[i] == randomNum) {
                        System.out.println("\n==========================");
                        System.out.println("CONGRATULATIONS!!!!");
                        System.out.println("You have guessed my number in " + (i+1) +" trys");
                        System.out.println("==========================\n");
                        break;
                    } else if (guess[i] > randomNum) {
                        System.out.println("\t" + guess[i] + " is high, guess lower.");
                        System.out.println("--"+(5 - (i + 1)) + " guess left.\n");
                    } else {
                        System.out.println("\t" + guess[i] + " is low, guess higher.");
                        System.out.println("--"+(5 - (i + 1)) + " guess left.\n");
                    }
                    if (i == 4) {
                        System.out.println("\n====================================");
                        System.out.println("Sorry!! You are out of guesses.");
                        System.out.println("=====================================\n");
                        break;
                    }
                }

                }

            }
        }






