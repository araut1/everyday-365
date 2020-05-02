import java.util.*;

class Solution {


    static public int numJewelsInStones(String J, String S) {

        Set<Character> j = new HashSet<>();

        for (int i = 0; i < J.length(); i++) {
            j.add(J.charAt(i));
        }

        int count=0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if(j.contains(c)){
                count++;
            }
        }



        return count;
    }


    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(numJewelsInStones( "aA","aAAbbbb"));
    }


}


