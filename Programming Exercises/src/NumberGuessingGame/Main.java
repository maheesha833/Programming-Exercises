package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Random random=new Random();
            Scanner scanner=new Scanner(System.in);

            int guess,max=11,min=1;
            int attempts=0;
            int randomNumber= random.nextInt(min,max);

            System.out.println("------Number Guessing Game------");
            System.out.println("Guess a number between 1-10:");

            do{
                System.out.println("Enter a guess:");
                guess=scanner.nextInt();
                attempts++;
                if(guess<randomNumber){
                    System.out.println("Too law! try again");
                }else if(guess>randomNumber){
                    System.out.println("Too high! try again");
                }else{
                    System.out.println("Correct! The number was"+randomNumber);
                    System.out.println("The number of attempts :"+attempts);
                }
            }while(guess!=randomNumber);
            System.out.println("****** You have won *******");
            scanner.close();
        }
    }


