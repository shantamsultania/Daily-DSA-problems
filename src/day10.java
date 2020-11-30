import java.util.LinkedList;
import java.util.Queue;

public class day10 {

    TreeNode root;
    day10()
    {
        root = null;
    }


    void insert(int[] a)
    {
        for (int value : a) {
            insert_data(value);
        }
    }

    void insert_data(int n)
    {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null )
        {
            root = new TreeNode(n);
            return;
        }
        q.add(root);
        while (!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if (temp.left == null)
            {
                temp.left = new TreeNode(n);
                return;
            }
            else
            {
                q.add(temp.left);
            }
            if (temp.right == null)
            {
                temp.right = new TreeNode(n);
                return;
            }
            else
            {
                q.add(temp.right);
            }

        }


    }
    void inorder()
    {
        inorder(root);
    }
    void inorder(TreeNode root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }
    void inverse()
    {
        root = inverse(root);
    }
    TreeNode inverse(TreeNode root)
    {
        if(root == null)
        {
            return root;
        }
        TreeNode left = inverse(root.left);
        TreeNode rigth = inverse(root.right);
        root.right =left;
        root.left = rigth;
        return root;
    }



}
