import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day13Test {

    @Test
    void test1()
    {
        day13 obj = new day13();
        assertEquals(5,obj.staircase(4));
        assertEquals(8,obj.staircase(5));
    }

}