package Soliutions;

import java.util.Arrays;

public class day14 {

 //     Hi, here's your problem today. This problem was recently asked by Uber:
    //
    //  Given a list of numbers, find if there exists a pythagorean triplet in that list.
    //  A pythagorean triplet is 3 variables a, b, c where a2 + b2 = c2
    //
    //
    //  Example:
    //
    // Input: [3, 5, 12, 5, 13]
    // Output: True
    // Here, 5 + 12 = 13.
    //
    //


    boolean findPythagoreanTriplets(int []a)
    {
        if (a.length < 3)
        {
            return false;
        }
        for(int i = 0;i<a.length;i++)
        {
            a[i] = a[i]*a[i];
        }
        Arrays.sort(a);
        for (int i= a.length-1;i>=2;i--)
        {
            int f = 0;
            int l = i-1;
            while (f<l)
            {
                if (a[f]+a[l] == a[i])
                {
                    System.out.println(a[f]+" "+a[l]);
                    return true;
                }
                if (a[f]+a[l] < a[i])
                {
                    f++;
                }
                else
                {
                    l--;
                }
            }
        }
        return false;
    }

}
