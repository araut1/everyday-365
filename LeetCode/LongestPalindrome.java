class Solution {
    public int longestPalindrome(String s) {
        
        int length = 0;
        char c;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if(set.contains(c)){
                length  ++;
                set.remove(c);
            } else{
                set.add(c);
            }
        }
        
        if(set.isEmpty()){
            return length*2;
        }else{
            return length*2+1;
        }




    }
}
