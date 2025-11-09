package BankingProgram;

import java.util.Scanner;

public class Main {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            double balance = 2400;
            boolean isRunning = true;
            int choice;


            while (isRunning) {
                System.out.println("------------------------------");
                System.out.println("****** BANKING PROGRAM ******");
                System.out.println("------------------------------");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("-----------------------------");

                System.out.print("Enter your choice (1-4) : ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        showBalance(balance);
                    case 2:
                        balance = balance + deposit();
                    case 3:
                        balance = balance - withdraw(balance);
                    case 4:
                        isRunning = false;
                    default:
                        System.out.println("invalid choice");
                }
            }
            System.out.println("-----------------------------");
            System.out.println("Thank You! Have a nice day!.");
            System.out.println("-----------------------------");

            scanner.close();
        }

        static void showBalance(double balance) {
            System.out.println("--------------------------");
            System.out.printf("your balance: $%.2f\n", balance);
        }


        static double deposit(){
            double amount;
            System.out.println("Enter an amount to be deposited : ");
            amount=scanner.nextDouble();

            if(amount<0){
                System.out.println("-------Invalid amount--------");
                return 0;
            }else{
                return amount;
            }
        }
        static double withdraw(double balance){
            double amount;
            System.out.println("Enter an amount to be withdrawn : ");
            amount=scanner.nextDouble();
            if(amount>balance){
                System.out.println("Insufficient funds");
                return 0;
            }else if(amount<0){
                System.out.println("Invalid Amount");
                return 0;
            }else {
                return amount;
            }
        }

    }

