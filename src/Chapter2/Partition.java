package Chapter2;

/**
 * Created by carolineshi on 7/30/16.
 */
public class Partition {

    public static void main(String[] args) {
        LinkedList<Integer> j = new LinkedList<Integer>();
        j.append(1);
        j.append(2);
        j.append(3);
        j.append(4);
        j.append(5);
        j.append(6);
        j.append(7);
        j.print(j.head);
        System.out.println(part(j.head, 5));
    }

    public static Node<Integer> part(Node head, int x) {
        Node before = head;
        Node after = head;

//        while(head!=null){
//            Node next = head.next;
//            if(){
//
//            }
//        }

        return head;
    }

}
