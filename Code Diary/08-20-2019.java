import java.io.*;
import java.util.*;

class Solution {

  static String decrypt(String word) {
           // your code goes here
    
  
        if (word == null || word.length() == 0) {
            return "";
        }

        char[] three = word.toCharArray();
        char[] two = new char[word.length()];
        char[] one = new char[word.length()];

        two[0] = three[0];
        one[0] = (char) (three[0] - 1);

        for (int i = 1; i < one.length; i++) {
            int temp =  (three[i] - two[i - 1]);



                while (temp < 97) {
                    temp += 26;
                }



            one[i] = (char) temp;
            two[i] = (char) (one[i] + two[i - 1]);

        }

        return String.valueOf(one);
  }

  public static void main(String[] args) {

  }

}
