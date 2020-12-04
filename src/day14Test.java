import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day14Test {


    @Test
    void test1()
    {
        int []a = {3, 5, 12, 5, 13};
        day14 obj = new day14();
        assertTrue(obj.findPythagoreanTriplets(a));
    }


}