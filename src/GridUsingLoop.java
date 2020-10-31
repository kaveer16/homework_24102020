/*Write a Java program to print the following grid
with 10 line using for loop.*/

public class GridUsingLoop {


    public static void main(String[] args) {

        for(int i = 0; i < 10; i++)//introducing i as a local variable
        {
            for(int j = 0; j < 10; j++)//introducing j as a local variable
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
