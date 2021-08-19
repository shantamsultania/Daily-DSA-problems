package Solutions;

import java.util.Stack;

public class day12 {

    //Hi, here's your problem today. This problem was recently asked by Twitter:
    //
    //Implement a class for a stack that supports all the regular functions (push, pop)
    // and an additional function of max() which returns the maximum element in the stack
    // (return None if the stack is empty).
    // Each method should run in constant time.

    Stack<Integer> st = new Stack<>();
    int max ;

    void push(int n)
    {
        if (st.isEmpty() )
        {
            max = n;
            st.push(n);
            return;
        }
        if (n>max)
        {
            st.push(2*n - max);
            max = n;
        }
        else
        {
            st.push(n);
        }
    }

    void pop()
    {
        if (st.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        int t = st.pop();
        if (t > max)
        {
            System.out.println(max);
            max = 2* max - t;

        }
        else
        {
            System.out.println(t);
        }
    }
    void getmax()
    {
        if (st.isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println(max);
        }
    }
    void peek()
    {
        if (st.isEmpty())
        {
            System.out.println("empty stack");
        }
        int t = st.peek();
        if (t > max)
        {
            System.out.println(max);
        }
        else
        {
            System.out.println(t);
        }
    }



    


}
