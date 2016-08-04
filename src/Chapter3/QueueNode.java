package Chapter3;

/**
 * Created by carolineshi on 8/3/16.
 */
public class QueueNode<T> {

    protected T data;
    protected QueueNode<T> next;

    public QueueNode(T data) {
        this.data = data;
    }

}
