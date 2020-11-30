import java.util.List;
import java.util.Stack;

public class day5 {


    //Daily Interview Pro
    //Hi, here's your problem today. This problem was recently asked by Google:
    //
    //Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?
    //
    //Example:
    //Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
    //Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL

    ListNode head;

    day5()
    {
        head = null;
    }

    void insert(int []a) {

        head = new ListNode(a[0]);
        ListNode temp = head;
        int i = 1;
        while (i < a.length) {
            temp.next = new ListNode(a[i]);
            temp = temp.next;
            i++;
        }

    }
    void printall()
    {
        ListNode header = head;
        while (header != null)
        {
            System.out.print(header.data+"  ");
            header = header.next;
        }
    }
    void re()
    {
        ListNode temp = reverse();
        while (temp != null)
        {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }
    ListNode reverse()
    {
        Stack<Integer> st = new Stack<>();
        ListNode n = head;
        while (n != null)
        {
            st.push(n.data);
            n = n.next;
        }
        ListNode temp = new ListNode(0);
        ListNode n1 = temp;
        while (!st.isEmpty())
        {
            n1.next = new ListNode(st.pop());
            n1 = n1.next;
        }
        return temp.next;

    }


}
