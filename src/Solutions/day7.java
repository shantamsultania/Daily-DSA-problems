package Solutions;

import java.util.HashSet;

public class day7 {

    // Hi, here's your problem today. This problem was recently asked by Facebook:
    //
    //You are given a list of numbers, and a target number k.
    // Return whether or not there are two numbers in the list that add up to k.
    //Example:
    //Given [4, 7, 1 , -3, 2] and k = 5,
    //return true since 4 + 1 = 5.
    //
    //def two_sum(list, k):
    //  # Fill this in.
    //
    //print two_sum([4,7,1,-3,2], 5)
    //# True

    boolean twosum(int []a,int target)
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int value : a) {
            int s = target - value;
            if (hs.contains(s)) {
                return true;
            } else {
                hs.add(value);
            }
        }
        return false;
    }



}


