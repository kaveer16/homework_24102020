//WAP to input any number and find out if it’s odd or even
//Created By Raj Anilkumar on 28/10/2020


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner eo=new Scanner(System.in); // Creating a scanner object
        System.out.print("Enter number : " );
        int number= eo.nextInt();
        eo.close();
        //using if else method
        if(number %2==0) {
            System.out.println(number + " is a even number");
        }else
                System.out.println(number + " is a odd number");

            }
        }





