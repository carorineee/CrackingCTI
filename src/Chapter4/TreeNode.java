package Chapter4;

/**
 * Created by carolineshi on 8/5/16.
 */
public class TreeNode {

    public int data;
    public TreeNode left, right, parent;
    private int size = 0;

    public TreeNode(int d) {
        this.data = d;
        this.size = 1;
    }

}
