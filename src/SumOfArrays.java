//Write a Java program to sum values of an array.

public class SumOfArrays {


    public static void main(String[] args) {
        int [] raj= {-1, 2, 3, -4, 5, 6, 7, 8, 9, -10};
        int sum = 0;

        for (int i : raj)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}