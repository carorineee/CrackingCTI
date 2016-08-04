package Chapter3;

import java.util.EmptyStackException;

/**
 * Created by carolineshi on 8/3/16.
 */
public class Queue<T> {

    private QueueNode<T> first;
    private QueueNode<T> last;

    public Queue() {
        first = null;
        last = null;
    }

    public void add(T item) {
        QueueNode<T> toAdd = new QueueNode<>(item);
        if(last!=null){
            last.next = toAdd;
        }
        last = toAdd;
        if(first==null) {
            first = last;
        }
    }

    public T remove() {
        if(first==null) throw new EmptyStackException();
        QueueNode<T> toRemove = first;
        first = first.next;
        if(first==null){
            last = first;
        }
        return toRemove.data;
    }

    public T peek() {
        if(first==null) throw new EmptyStackException();
        return first.data;
    }

    public boolean isEmpty() {
        return first==null;
    }

}
