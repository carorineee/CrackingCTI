package Chapter2;

/**
 * Created by carolineshi on 7/29/16.
 */
public class DelMidNode {

    public static void main(String[] args) {
        LinkedList<Integer> j = new LinkedList<Integer>();
        j.append(1);
        j.append(2);
        j.append(3);
        j.append(4);
        j.append(5);
        j.print(j.head);
        System.out.println();
        DelNode(j.head.next.next.next);
        j.print(j.head);
    }

    //Note: if given reference to the last node, it cannot be deleted since you can't go backwards in a singly linked list
    public static void DelNode(Node node){
        Node next = node.next;

        while(next!=null){
            node.data = next.data;
            if(next.next==null){
                node.next = null;
                next = null;
            } else {
                node = node.next;
                next = next.next;
            }
        }

    }

}
