import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day2Test {


    @Test
    void test1()
    {
        day2 obj = new day2();
        String s = "((()))";
        assertTrue(obj.isValid(s));

    }

    @Test
    void test2()
    {
        day2 obj = new day2();
        String s = "({[)]";
        assertFalse(obj.isValid(s));
    }


}