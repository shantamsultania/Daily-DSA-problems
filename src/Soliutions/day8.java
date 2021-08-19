package Soliutions;

public class day8 {

    //Hi, here's your problem today. This problem was recently asked by Facebook:
    //
    //Given a list of numbers, where every number shows up twice except for one number, find that one number.
    //
    //Example:
    //Input: [4, 3, 2, 4, 1, 3, 2]
    //Output: 1
    //Here's the function signature:

    int single_number(int []a)
    {
        // xor
        // 00 = 1;
        // 11 = 1;
        // 10 || 01 == 0 ;
        int res = a[0];
        for (int i=1;i<a.length;i++)
        {
            res = res ^ a[i];
        }

        return res;

    }
}
