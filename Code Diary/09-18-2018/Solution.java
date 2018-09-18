package leetCodeOne;


import static java.lang.Math.pow;

public class Solution {

    public int[] plusOne(int[] digits) {

        int length = digits.length;
        int lengthNew;
        int intDigits = 0;
        int power = 0;


        // convert digits array to int

        for (int i = length - 1; i >= 0; i--) {

            intDigits = (intDigits + (int) (digits[i] * pow(10, power)));

            power++;
        }

        // increase count of integer by 1
        intDigits++;

        // check if size is is increased by one

        if ((int) (intDigits / pow(10, length)) == 0) {

            power = 0;
            int[] ret = new int[length];
            for (int i = length - 1; i >= 0; i--) {

                ret[i] = (int) (intDigits / pow(10, power)) % 10;
                power++;
            }
            return ret;
        } else {

            power = 0;
            lengthNew =length +1;
            int[] ret = new int[lengthNew];
            for (int i = lengthNew - 1; i >= 0; i--) {

                ret[i] = (int) (intDigits / pow(10, power)) % 10;
                power++;
            }
            return ret;
        }


        // based on size assign ret array


        // save integer into ret
        // intDigits = 136;
//        power = 0;
//        int[] ret = new int[length];
//        for (int i = length - 1; i >= 0; i--) {
//
//            ret[i] = (int) (intDigits / pow(10, power)) % 10;
//            power++;
//        }



    }
}

