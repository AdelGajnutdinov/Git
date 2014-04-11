/**
 * Created by Адель on 08.04.14.
 */
public class Stack <T> {
    LinkedList <T> stack = new LinkedList<T>();

    public void push(T data) {
        stack.add(data);
    }

    public T pop() throws Exception {
        return stack.remove();
    }

    public T peek() throws Exception {
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }
}
