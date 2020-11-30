import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day4Test {


    @Test
    void test1()
    {
        String s = "abrkaabcdefghijjxxx";

        day4 obj = new day4();

        assertEquals(10,obj.lengthoflongestsubstring(s));
    }

    @Test
    void test2()
    {
        String s = "";

        day4 obj = new day4();

        assertEquals(0,obj.lengthoflongestsubstring(s));
    }


    @Test
    void test3()
    {
        String s = "pwwkew";

        day4 obj = new day4();

        assertEquals(3,obj.lengthoflongestsubstring(s));
    }





}