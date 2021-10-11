package Solutions;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Questions {


    // Question 1
    // Date : [20/08/2021]
    // Find the Single Element in an Array of Duplicates

    public int findSingleElement(int arr[]) {

        HashMap<Integer, Integer> tempMap = new HashMap<>();
        for (int i : arr) {
            if (tempMap.containsKey(i)) {
                tempMap.put(i, tempMap.get(i) + 1);
            } else {
                tempMap.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : tempMap.entrySet()) {
            if (integerIntegerEntry.getValue() == 1) {
                return integerIntegerEntry.getKey();
            }
        }

        return -1;

    }

    // Question 2
    // Date : [29/09/2021]
    // Count Primes

    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        int tempArray[] = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            tempArray[i] = -1;
        }

        for (int i = 2; i * i <= n; i++) {

            if (tempArray[i] == -1) {

                for (int j = i * i; j <= n; j += i) {
                    // System.out.println(tempArray[i]);

                    tempArray[j] = 0;
                }
            }

        }

        int c = 0;
        for (int i = 2; i < n; i++) {
            if (tempArray[i] == -1) {
                c++;
            }
            // System.out.println(tempArray[i]);
        }


        return c;
    }


    // Question 3
    // Date [29/09/2021]
    // Find Pivot Index

    public int pivotIndex(int[] nums) {

        int sum = 0;
        int pivote = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (sum == sum2) {

                return i;
            } else {
                System.out.println(sum);

                sum2 += nums[i];
            }
        }

        return -1;

    }


    // Question 4
    // Date [29/09/2021]
    // Largest Number At Least Twice of Others

    public int dominantIndex(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int largest = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != largest && (nums[i] * 2) > largest) {
                return -1;
            }

        }

        return index;

    }


    public int expressionCheck(String expression){

        Stack<Character> st = new Stack<>();
        int res = 0;




        return res;

    }


}
