package Chapter2;

import java.util.HashSet;

/**
 * Created by carolineshi on 7/20/16.
 */
public class RemoveDups {

    public static void main(String[] args){
        LinkedList<Integer> j = new LinkedList<Integer>();
        j.append(3);
        j.append(3);
        j.append(4);
        j.append(3);
        j.append(5);
        j.append(4);
        j.append(3);
        j.print(j.head);
//        removeDups(j.head);
//        removeDupsNoBuffer(j.head);
        System.out.println();
        j.print(j.head);
    }

    public static void removeDups(Node head){
        HashSet<Object> j = new HashSet<Object>();
        Node previous = null;
        Node n = head;

        while(n != null){
            if(j.contains(n.data)){
                previous.next = n.next;
            } else {
                j.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }

    public static void removeDupsNoBuffer(Node head) {
        Node current = head;
        Node runner;
        while(current.next!=null) {
            runner = current;
            while(runner.next!=null){
                if(current.data==runner.next.data){
                    runner.next = runner.next.next;
                }
                else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
