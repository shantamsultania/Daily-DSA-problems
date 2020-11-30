import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day8Test {

    @Test
    void test1()
    {
        int []a = {4, 3, 2, 4, 1, 3, 2};

        day8 obj = new day8();
        assertEquals(1,obj.single_number(a));
    }


}