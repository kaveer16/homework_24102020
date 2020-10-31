//Write a Java program to test if an array contains a specific value.


public class SpecificValue {

    public static boolean contains(int[] arr, int item) {  //  static method with parameters
        for (int n : arr) {  //
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {
                786, 788, 899, 456, 213,
                458, 245, 125, 472, 265,
                146, 265, 157, 256};
        System.out.println(contains(array, 213));
        System.out.println(contains(array, 215));
    }
}

