package TemperatureConverter;

import java.util.Scanner;

    public class Main{
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            double temp;
            double newTemp;
            String unit;

            System.out.print("Enter the Temperature: ");
            temp=scanner.nextDouble();

            System.out.println("Convert to celsius or Fahrenheit? (C or F): ");
            unit=scanner.next();

            System.out.println(temp);
            System.out.println(unit);
            newTemp=(unit.equals("C")) ?(temp-32)*5/9: (temp*9/5)+32;
            System.out.println(newTemp+"'"+unit);
            scanner.close();
        }
    }

