import java.io.*;
import java.util.*;

class Solution {

    public static int firstUniqChar(String s) {


        int firstUniquePos = Integer.MAX_VALUE;
        int counter=0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!(map.containsKey(s.charAt(i)))) {

                map.put(s.charAt(i), i);

            } else {
                map.put(s.charAt(i), -1);
            }

        }

        for (Integer x : map.values()) {

            if (x < firstUniquePos && x >= 0) {
                firstUniquePos = x;
                counter++;
            }
        }
        if(counter==0)
        {
            firstUniquePos =-1;
        }


        return firstUniquePos;

    }

    public static void main(String[] args) {

        int a = Solution.firstUniqChar("abca");
        System.out.println(a);
    }

}
