//a java program that tell us that Input number is odd or even?, using ternary method
/*Created Raj Anilkumar
on 25/10/2020
 */

package HomeWorkJava;

import java.util.Scanner; //using scanner method

public class OddEven {
    public static void main(String[] args) {
        Scanner oe=new Scanner(System.in); //creating scanner object
        System.out.println("please input the number:");
        int number= oe.nextInt();
        String StrInput=(number% 2==0) ? "even" : "odd"; /*using ternary method to verify whether the input
                                                          number is odd or even*/
        System.out.println(number +  " is "  +  StrInput);

        //for extra practice using vice versa

        System.out.println("Please input a number1:");
        int number1= oe.nextInt();
        String strInput1;
        strInput1 = (number% 2==0)? " odd" : " even";
        System.out.println( number1 + " is " + strInput1);
        oe.close();

    }
}
