/*WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales
 Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
             >= 20,000 10%
             >= 10,000 5%
              < 10,000 2% */
//Created by Raj Anilkumar on 28/10/2020

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);// creating scanner object.
        System.out.print("Sales ID: " );
        int id = sc.nextInt();
        System.out.print("Seller's Name: ");
        String name= sc.next();
        System.out.print("Sales Amount: " +"£" );
        Double amt= sc.nextDouble();
        System.out.print("Basic Salary: " + "£");
        Double sal= sc.nextDouble();
        System.out.print("Enter commissionPercentage:");
        double per=sc.nextDouble();
        double commission=(per/100)*amt;
        System.out.println("Commission Amount: "+ commission );



        }






    }

