
class MaxStack {

    Stack<Integer> stack;
    Stack<Integer> maxStack;
    Stack<Integer> temp;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
        temp = new Stack<>();

    }

    public void push(int x) {
        int max = maxStack.isEmpty() ? x : maxStack.peek();
        maxStack.push(max > x ? max : x);
        stack.push(x);
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int x, toRemove = 0;


        if (!stack.isEmpty()) {

            toRemove = peekMax();
            x = top();

            while (!stack.isEmpty()) {

                if (x != toRemove) {

                    temp.push(x);
                    pop();

                    x = stack.peek();

                } else {
                    pop();
                    break;
                }

            }

            while (!temp.isEmpty()) {
                x = temp.pop();
                push(x);


            }


        }

        return toRemove;
    }

}
