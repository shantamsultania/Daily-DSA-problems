public class day6 {


    //Hi, here's your problem today. This problem was recently asked by Google:
    //
    //Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list in O(n) time.
    //
    //Example 1:
    //Input: [3, 3, 2, 1, 3, 2, 1]
    //Output: [1, 1, 2, 2, 3, 3, 3]

    int [] sorting(int []a)
    {
        int k=1;
        int j=0;
        while (k<4) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == k)
                {
                    int temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                    j++;
                }
            }
            k++;
        }
        return a;
    }

}
