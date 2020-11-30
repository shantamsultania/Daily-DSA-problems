import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class day3Test {



    @Test
    void test1()
    {
        day3 obj = new day3();
        int []a = {2,4,3};
        int []b = {5,6,4};
        Integer[] res = {7,0,8};
        obj.insert1(a);
        obj.insert2(b);

        ArrayList<Integer> r;
        r = new ArrayList<>(Arrays.asList(res));

        assertEquals(r,obj.printres());
    }

    @Test
    void test2()
    {
        int[] a1 ={9,9,9,9,9,9,9};
        int[] a2 = {9,9,9,9};
        Integer[] res = {8,9,9,9,0,0,0,1};

        ArrayList<Integer> r = new ArrayList<>(Arrays.asList(res));
        day3 obj = new day3();
        obj.insert1(a1);
        obj.insert2(a2);

        assertEquals(r,obj.printres());

    }

}