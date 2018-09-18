package leetCodeOne;


public class Driver {
    public static void main(String[] args) {

        int[] digit = {9,9,9};


        Solution sol1 = new Solution();

        int[] ret = sol1.plusOne(digit);

        System.out.println("Input:");
        for (int i: digit)
        {
            System.out.print(i);
        }

        System.out.println("\nOutput:");
        for (int i: ret)
        {
            System.out.print(i);
        }
    }
}
