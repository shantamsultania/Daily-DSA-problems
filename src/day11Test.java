import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day11Test {

    @Test
    void test1()
    {

        day11 obj = new day11();
        int a[] = {8,4,12,2,6,10,14};
        obj.insert(a);
        int res[] = {4,6};
        assertArrayEquals(res,obj.findCeilingFloor(5));

    }
    @Test
    void test2()
    {

        day11 obj = new day11();
        int a[] = {8,4,12,2,6,10,14};
        obj.insert(a);
        int res[] = {6,10};
        assertArrayEquals(res,obj.findCeilingFloor(8));

    }
    @Test
    void test3()
    {

        day11 obj = new day11();
        int a[] = {8,4,12,2,6,10,14};
        obj.insert(a);
        int res[] = {6,10};
        assertArrayEquals(res,obj.findCeilingFloor(8));

    }


}