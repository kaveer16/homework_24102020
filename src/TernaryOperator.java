/*Write a java program that tell us that Input number is odd or even?
HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);//Creating Scanner Object

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        //Ternary Operator
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

        }
    }

