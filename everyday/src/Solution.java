import java.util.*;

class Solution {

  

  int min = Integer.MAX_VALUE;

    Stack<Integer> stack;
    Stack<Integer> minstack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();


    }

 public void push(int x) {

        stack.push(x);

        if (x <= min) {
            minstack.push(x);
            min = minstack.peek();

        }


    }

    public void pop() {

        if (!stack.isEmpty()) {
            int temp = stack.peek();
            stack.pop();

            if (temp == minstack.peek()) {
                minstack.pop();
                if (!minstack.isEmpty()) {
                    min = minstack.peek();
                } else if(minstack.isEmpty()){
                    min = Integer.MAX_VALUE;
                }
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return 0;
        }
    }

    public int getMin() {

        if (!minstack.isEmpty()) {
            return minstack.peek();
        } else {
            return 0;
        }

    }


    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c","#a#c"));

    }


}


