public class day11 {

    // Hi, here's your problem today. This problem was recently asked by Apple:
    //
    //Given an integer k and a binary search tree, find the floor (less than or equal to) of k, and the ceiling (larger than or equal to) of k. If either does not exist, then print them as None.
    //
    //Here is the definition of a node for the tree.


    TreeNode root;
    day11()
    {
        root = null;
    }
    void insert(int[] a)
    {
        for (int value : a) {
            insert(value);
        }

    }
    void insert(int n)
    {
        root = inserted(root,n);
    }
    TreeNode inserted(TreeNode root, int n)
    {
        if (root == null)
        {
            root = new TreeNode(n);
            return root;
        }
        else if (n < root.data)
        {
            root.left = inserted(root.left,n);
        }
        else if (n>root.data)
        {
            root.right = inserted(root.right,n);
        }
        return root;

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
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    int [] findCeilingFloor(int n)
    {
        int res[] = findCeilingFloor(root,n);
        for (int value: res)
        {
            System.out.println(value);
        }
        return res;
    }
    int [] findCeilingFloor(TreeNode root, int n)
    {
        int res[] = new int[2];
        finder(root,n,res);
        return res;
    }
    void finder(TreeNode root,int n,int []res)
    {

        if (root != null)
        {
            finder(root.left,n,res);
            if (root.data < n)
            {
                res[0] = root.data;
            }
            else if (root.data > n) {
                if (res[1] == 0) {
                    res[1] = root.data;
                }
            }
            finder(root.right,n,res);
        }


    }






}
