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














import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int U = scanner.nextInt();
        int L = scanner.nextInt();
        int C = scanner.nextInt();
        int N = scanner.nextInt();


        if(U==0 && L==0 && C==0 && N == 1){
            System.out.println("!");
            return;
        }

        StringBuilder sb = new StringBuilder(" ");

        for (int i = 0; i < U; i++) {

            char c = (char) ( (int)(Math.random() * 26) + 65);;
            char f = sb.charAt(0);

            while(c == f){
                c = (char) ( (int)(Math.random() * 26) + 65);
            }

            sb.insert(0,c);

        }


        for (int i = 0; i < L; i++) {

            char c = (char) ( (int)(Math.random() * 26) + 97);;
            char f = sb.charAt(0);

            while(c == f){
                c = (char) ( (int)(Math.random() * 26) + 97);
            }

            sb.insert(0,c);

        }

        for (int i = 0; i < C; i++) {

            char c = (char) ( (int)(Math.random() * 9) + 48);;
            char f = sb.charAt(0);

            while(c == f){
                c = (char) ( (int)(Math.random() * 9) + 48);
            }

            sb.insert(0,c);

        }


        while (sb.length() != N+1){

            char c = (char) ( (int)(Math.random() * 9) + 48);;
            char f = sb.charAt(0);

            while(c == f){
                c = (char) ( (int)(Math.random() * 9) + 48);
            }

            sb.insert(0,c);

        }


        System.out.println(String.valueOf(sb).trim());
    }
}
