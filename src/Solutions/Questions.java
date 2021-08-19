package Solutions;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

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

}
