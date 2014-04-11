/**
 * Created by Адель on 02.04.14.
 */
public interface List <T> {
    void add(T number);
    T remove() throws Exception;
    T peek() throws Exception;
}
