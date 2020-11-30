public class day9 {

    //Hi, here's your problem today. This problem was recently asked by Microsoft:
    //
    //You are given an array of integers in an arbitrary order. Return whether or not it is possible to make the array non-decreasing by modifying at most 1 element to any value.
    //
    //We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
    //
    //Example:
    //
    //[13, 4, 7] should return true, since we can modify 13 to any value 4 or less, to make it non-decreasing.
    //
    //[13, 4, 1] however, should return false, since there is no way to modify just one element to make the array non-decreasing.
    //

    // 5,1,3,2,5 = false

    boolean check(int []a)
    {
        int c = 0;
        for (int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                c++;
            }
        }
        if (c > 1)
        {
            return false;
        }
        return true;
    }

}
