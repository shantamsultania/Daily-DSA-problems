import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day1Test {

    @Test
    void test1()
    {
        int A[] = {1,3,3,5,7,8,9,9,9,15};
        int target = 9;

        day1 obj = new day1();
        int res[] ={6,8};
        assertArrayEquals(new int[]{6,8},obj.getrange(A,target));
    }

    @Test
    void test2()
    {
        int A[] = {100, 150, 150, 153};
        int target = 150;

        day1 obj = new day1();
        int res[] ={1,2};
        assertArrayEquals(res,obj.getrange(A,target));
    }

    @Test
    void test3()
    {
        int a[] = {1,2,3,4,5,6,10};
        int t = 9;
        day1 obj = new day1();
        int res [] = {-1,-1};

        assertArrayEquals(res,obj.getrange(a,t));
    }

}