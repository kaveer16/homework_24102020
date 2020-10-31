/*WAP to input any two number and ask user to enter their symbol (+, -, /, *) find addition,
Subtraction, multiplication and division according to their symbol (using if else)*/


import java.util.*;


public class ProgramTen {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);// creating scanner object
                System.out.print("Enter number: ");
                int num = in.nextInt();
                System.out.print("Enter number: ");
                int num1 = in.nextInt();

                System.out.println("Choose Operator [1]-multiply [2]-Addition [3]- Minus [4]- Divide [5]- Modules: ");
                int ch = in.nextInt();
                if (ch == 1) {
                    System.out.println("Answer: " + num * num1);
                } else if (ch == 2) {
                    System.out.println("Answer: " + num + num1);
                } else if (ch == 3) {
                    System.out.print("Answer: ");
                    System.out.print(num - num1);
                } else if (ch == 4) {
                    System.out.println("Answer: " + num / num1);
                } else if (ch == 5) {
                    System.out.println("Answer: " + num % num1);
                }


            }
        }



