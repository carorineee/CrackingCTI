package Chapter2;

/**
 * Created by carolineshi on 7/27/16.
 */
public class LinkedList<T> {

    Node<T> head;

    public LinkedList(){
        head = null;
    }

    public void append(T data){
        Node newNode = new Node(data);
        Node n = head;

        if(n==null){
            head  = newNode;
            newNode.next = null;
        }
        else {
            while(n.next!=null) {
                n = n.next;
            }
            n.next = newNode;
            newNode.next = null;
        }
    }

    public void print(Node<T> head) {
        while(head!=null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public Node<T> reverse(Node<T> head){
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }


}
