package Chapter3;

import java.util.EmptyStackException;

/**
 * Created by carolineshi on 7/31/16.
 */
public class Stack<T> {

    StackNode<T> top;

    public Stack(){
        this.top = null;
    }

    public T pop() {
        if(top==null) throw new EmptyStackException();
        T toPop = top.data;
        top = top.next;
        return toPop;
    }

    public void push(T data) {
        StackNode<T> newNode = new StackNode<T>(data);
        newNode.next = top;
        top = newNode;
    }

    public T peek() {
        if(top==null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

}
