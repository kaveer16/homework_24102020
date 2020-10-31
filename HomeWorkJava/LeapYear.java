//input any year like (ex.2007) and find out if it is leap year or not?
// Created by Raj Anilkumar on  26/1/2020


package HomeWorkJava;



import java.util.Scanner;

public class LeapYear {
    int year;
    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = lp.nextInt();
        lp.close();

        boolean leap=false;
        if (year % 4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else leap = false;
            }
            if(leap);
            System.out.println(year + " is a leap year.");
        }
        else
            System.out.println(year + " is not a leap year.");
    }

    }



