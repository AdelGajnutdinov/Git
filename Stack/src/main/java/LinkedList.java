/**
 * Created by Адель on 02.04.14.
 */

public class  LinkedList <T> implements List <T> {
    private Refer <T> first;
    private Refer <T> last;
    public int N;
    public LinkedList () {
        Refer first = new Refer();
        Refer last = new Refer();
        first = null;
        first = last;
        N = 0;
    }
    public LinkedList (T data) {
        Refer first = new Refer();
        first.data = data;
        first.next = null;
        N++;
    }
    public void add(T data) {
        Refer refer = new Refer();
        refer.data = data;
        refer.next = null;
        if (last == null)
            last = refer;
        else {
            last.next = refer;
            last = refer;
        }
        N++;
    }
    public T remove() throws Exception {
        Refer <T> temp = last;
        if (last == null)
            throw new Exception("List is empty!");
        else {
            deleteLastRefer();
            N--;
            return temp.data;
        }
    }

    public void deleteLastRefer() {
        Refer f = first;
        while (f.next != last)
            f = f.next;
        last = f;
        last.next = null;
    }

    public T peek() throws Exception {
        if (last == null)
            throw new Exception("List is empty!");
        else
            return last.data;
    }
    public int size() {
        return N;
    }
}
class Refer <T> {
    public T data;
    public Refer next;

}