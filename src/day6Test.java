import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day6Test {


    @Test
    void test1()
    {
        int a[] = {3, 3, 2, 1, 3, 2, 1};

        day6 obj = new day6();
        int rs[] = {1, 1, 2, 2, 3, 3, 3};
        assertArrayEquals(rs,obj.sorting(a));
    }
    @Test
    void test2()
    {
        int a[] = { 2, 1, 3, 2, 1};

        day6 obj = new day6();
        int rs[] = {1, 1, 2, 2, 3};
        assertArrayEquals(rs,obj.sorting(a));
    }

}