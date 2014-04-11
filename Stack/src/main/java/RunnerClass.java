/**
 * Created by Адель on 08.04.14.
 */
public class RunnerClass {
    public static void main(String args[]) {
        Stack <Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        try {
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.size());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
