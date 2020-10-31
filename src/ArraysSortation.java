import java.util.Arrays;

public class ArraysSortation {

    public static void main(String[] args){

        int[] a= {
                347, 12, 189, 146, 213,
                18, -58, 54, -172, 2365,6};

        String[] b = {
                "super","duper","hit","movie","ice cream", "popcorn"
        };
        System.out.println("Original numeric array : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted numeric array : "+Arrays.toString(a));

        System.out.println("Original string array : "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Sorted string array : "+Arrays.toString(b));
    }
}

