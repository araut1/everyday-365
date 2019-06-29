import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Solution {

        static public boolean isPowerOfTwo(int n) {

            boolean is = false;

            if (n % 2.0 == 1 && n > 1) {
                return false;

            }

            if (n == 1) {
                return true;
            }

            if (isPowerOfTwo(n / 2)) {
                return true;
            }

            return is;
        }



    public static void main(String[] args) {

        boolean a = Solution.isPowerOfTwo(32);
        System.out.println(a);
    }

}
