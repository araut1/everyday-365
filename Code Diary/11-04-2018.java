public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.nextLine();
        
        String s;
        int length;
        
        for( int j =0; j < num; j++)
        {
        s =  sc.nextLine();
        length = s.length();
        for(int i =0; i < length; i=i+2)
        {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
        for(int i =1; i < length; i=i+2)
        {
            System.out.print(s.charAt(i));
        }        
        System.out.println();

        }
        
        sc.close();
        
    }
}
