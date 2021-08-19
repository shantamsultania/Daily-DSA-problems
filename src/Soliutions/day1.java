package Soliutions;

public class day1 {

    //Hi, here's your problem today. This problem was recently asked by AirBNB:
    //
    //Given a sorted array, A, with possibly duplicated elements, find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.
    //
    //Example:
    //Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
    //Output: [6,8]
    //
    //Input: A = [100, 150, 150, 153], target = 150
    //Output: [1,2]
    //
    //Input: A = [1,2,3,4,5,6,10], target = 9
    //Output: [-1, -1]



    int [] getrange(int a[],int x)
    {
        int res[] = new int[2];

        int f = 0;
        int l = a.length-1;

       while(f <l)
       {
           if (a[f] == x)
           {
               res[0] = f;
               break;
           }
           else
           {
               f++;
           }
       }
       int flag=0;
       while (l>=0)
       {
           if (a[l] == x)
           {
               flag++;
               res[1] = l;
               break;
           }
           else
           {
               l--;
           }
       }
       if (flag == 0)
       {
           return new int[]{-1,-1};
       }
        return res;
    }

}
