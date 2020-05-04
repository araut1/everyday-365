class Solution {
    public int bitwiseComplement(int num) {
        if(num==0)
            return 1;
        int x = (int)(Math.log(num) / Math.log(2));
        int k = (int)(Math.pow(2,x+1)-1);
        return k-num; // return num ^ k is also valid.. both are same.
    }
}
