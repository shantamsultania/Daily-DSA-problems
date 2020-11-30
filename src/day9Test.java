import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day9Test {


    @Test
    void test1()
    {
        int a[] = {13,4,7};
        day9 obj = new day9();

         assertTrue(obj.check(a));
    }
    @Test
            void test2()
    {
        int a[] = {13,4,1};
        day9 obj = new day9();

        assertFalse(obj.check(a));
    } @Test
            void test3()
    {
        int a[] = {5,1,3,2,5};
        day9 obj = new day9();

        assertFalse(obj.check(a));
    }

}