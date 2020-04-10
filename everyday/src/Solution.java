import java.util.*;

class Solution {

    static public boolean backspaceCompare(String S, String T) {

        Stack<Character> s = new Stack<>();
        Stack<Character> t = new Stack<>();


        // S
        for (int i = 0; i < S.length(); i++) {

            char c = S.charAt(i);

            if(c == '#'){

                if(s.size()!= 0){
                    s.pop();
                }
            } else {
                s.push(c);
            }
        }


        // T
        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);

            if(c == '#'){

                if(t.size()!= 0){
                    t.pop();
                }
            } else {
                t.push(c);
            }
        }

        // check
        if(s.size() != t.size()){
            return false;
        }

        for (int i = 0; i < s.size(); i++) {
            if(s.pop() != t.pop()){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c","#a#c"));

    }


}


