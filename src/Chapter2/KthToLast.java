package Chapter2;

/**
 * Created by carolineshi on 7/29/16.
 */
public class KthToLast {

    public static void main(String[] args) {
        LinkedList<Integer> j = new LinkedList<Integer>();
        j.append(1);
        j.append(2);
        j.append(3);
        j.append(4);
        j.append(5);
        j.append(6);
        j.append(7);
        System.out.println(Better(j.head, 2));
    }

    public static int KToLast(Node head, int k) {
        int length = 0;
        Node n = head;

        while(n!=null) {
            length++;
            n = n.next;
        }

        n = head;
        int place = length - k;
        for(int x = 1; x <= place; x++){
            n = n.next;
        }
        return (int) n.data;
    }

    public static int Better(Node head, int k) {
        Node s1 = head;
        Node s2 = head;

        for(int x = 1; x <= k; x++){
            s1 = s1.next;
        }

        while(s1!=null){
            s1 = s1.next;
            s2 = s2.next;
        }
        return (int) s2.data;
    }

}
