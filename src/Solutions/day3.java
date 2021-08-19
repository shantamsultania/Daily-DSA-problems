package Solutions;

import java.util.ArrayList;

public class day3 {

    //addTwoNumbers
    //Hi, here's your problem today. This problem was recently asked by Microsoft:
    //
    //You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
    //
    //Example:
    //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    //Output: 7 -> 0 -> 8
    //Explanation: 342 + 465 = 807.

    ListNode n1,n2;
    day3()
    {
        n1 = null;
        n2 = null;
    }

    void insert1(int []a)
    {
        int i = 1;
        n1 = new ListNode(a[0]);
        ListNode temp = n1;
        while (i < a.length)
        {
            temp.next = new ListNode(a[i]);
            temp = temp.next;
            i++;
        }
    }
    void get1()
    {
        ListNode temp = n1;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    void insert2(int[] a)
    {
        int i =1;
        n2 = new ListNode(a[0]);
        ListNode temp = n2;
        while (i<a.length)
        {
            temp.next = new ListNode(a[i]);
            temp = temp.next;
            i++;
        }
    }
    void get2()
    {
        ListNode temp = n2;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    ArrayList<Integer> printres()
    {
        ListNode a = add2list();
        ArrayList<Integer> res = new ArrayList<Integer>();

        while (a != null)
        {
            res.add(a.data);
            a = a.next;
        }


        return res;
    }

    ListNode add2list()
    {
        ListNode res = new ListNode(0);
        ListNode n = res;

        int carry = 0;
        int x=0,y=0;

        while (n1 != null || n2 != null)
        {
            if (n1 !=null)
            {
                x = n1.data;

            }
            else
            {
                x = 0;
            }
            if (n2 != null)
            {
                y = n2.data;
            }
            else
            {
                y = 0;
            }

            int sum = carry+x+y;
            carry = sum /10;
            n.next = new ListNode(sum%10);
            n = n.next;
            if (n1 != null)
            {
                n1 = n1.next;
            }
            if (n2 != null)
            {
                n2 = n2.next;
            }

        }
        if (carry > 0)
        {
            n.next = new ListNode(carry);
        }
        return res.next;
    }



}
