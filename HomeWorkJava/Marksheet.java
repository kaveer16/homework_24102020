/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input,
Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade
>= 80 A+, >= 60 A, >= 50 B, >= 35 C And print Mark Sheet */


package HomeWorkJava;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {

        System.out.println(" ___________________________");
        System.out.println("|                           |");
        System.out.println("|         Mark Sheet        |");
        System.out.println("|___________________________|");

        Scanner ms=new Scanner(System.in);


        System.out.print("|Name\t\t: ");
        String name = ms.nextLine();
        System.out.print("|Roll No\t: ");
        String roll= ms.next();
        System.out.println("|___________________________|");
        System.out.print("|Subject\t: ");
        String subject =ms.next();
        System.out.println("|___________________________|");
        System.out.print("|Maths \t\t: ");
        int maths= ms.nextInt();
        System.out.print("|Science\t: ");
        int sci= ms.nextInt();
        System.out.print("|English\t: ");
        int eng= ms.nextInt();
        System.out.println("-----------------------------");

        int total;
        total = maths+sci+eng;
        System.out.println("|Total \t\t: " + total);
        System.out.println("-----------------------------");

        double percentage;
        percentage = total/3;
        System.out.println("|Percentage\t: " + percentage);

        if((maths>=50)&&(sci>=50)&&(eng>=50)){
            System.out.println("|Result \t: PASS ");
        }else

            System.out.println("|Result \t: FAIL");
        System.out.println("|___________________________|");

        if (percentage>=80){
            System.out.println("|Grade \t\t: A+");
        }

        if(percentage>=60 && percentage <80) {
            System.out.println("|Grade \t\t: A");
        }
        if(percentage>50 && percentage <60) {
            System.out.println("|Grade \t\t: B");
        }
        System.out.println("|___________________________|");

            }
        }










