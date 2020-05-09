import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here


        Scanner scanner = new Scanner(System.in);

        char[] s = scanner.nextLine().toCharArray();
        String a = "";

        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{s[0], 1});

        for (int i = 1; i < s.length; i++) {

            char c = s[i];

            if (stack.peek()[0] == c) {
                int[] x = stack.pop();
                x[1] +=1;
                stack.push(x);

            } else {
                stack.push(new int[]{c, 1});
            }


        }

       while (!stack.isEmpty()){
           int[] x = stack.pop();
           a = x[1] + a;
           a = (char)x[0] + a;

       }


        System.out.println(a);
    }
}
