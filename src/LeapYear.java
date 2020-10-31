//WAP to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;


public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in); //creating static object
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();


        boolean isLeap = false; //using boolean database for true & false value

         //using if/else statements
        if(year % 4 == 0)
        {
        if( year % 100 == 0)
        { if ( year % 400 == 0)
            isLeap = true;
        else
            isLeap = false;
        }
        else
            isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
        }
    }

