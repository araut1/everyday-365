class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        
        int[] a = new int[26];
        
        Arrays.fill(a,0);
        
        
        for(int i=0;i< magazine.length();i++){

            char c = magazine.charAt(i);
            a[c - 'a'] = a[c - 'a'] + 1;
        }
        
        
         for(int i=0;i< ransomNote.length(); i++){

            char c = ransomNote.charAt(i);
            a[c - 'a'] = a[c - 'a'] - 1;
        }
        
        for(int i=0;i< a.length; i++){

           if(a[i] < 0){
               return false;
           }
        }
        return true;
    }
}
