class Solution {
    public boolean judgeCircle(String moves) {
                int x=0;
        int y=0;
        boolean posOrigint = false;

        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);

            if(c == 'U')
            {
                y++;
            }
            if(c == 'D')
            {
                y--;
            }
            if(c == 'R')
            {
                x++;
            }
            if(c == 'L')
            {
                x--;
            }
        }


        if (x==0 && y==0){
            posOrigint = true;
        }
        return posOrigint;
    }
}
