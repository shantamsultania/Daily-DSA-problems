public class day13 {

    //Hi, here's your problem today. This problem was recently asked by LinkedIn:
    //
    //You are given a positive integer N which represents the number of steps in a staircase.
    // You can either climb 1 or 2 steps at a time.
    // Write a function that returns the number of unique ways to climb the stairs.

    //  Can you find a solution in O(n) time?
    //
    //        Hint
    //        0,1,2,3,5,8,13,21 .. so on
    //
    //
    //

    int staircase(int n)
    {
        if (n <=2)
        {
            return n;
        }
        n = n-2;
        int a = 1;
        int b = 2;
        int c = 0;
        while (n-- >0)
        {
            c = a+b;
            System.out.println(c);
            a= b;
            b = c;

        }

        return c;

    }

}
