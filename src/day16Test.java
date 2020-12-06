import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day16Test {


    @Test
    void test1()
    {
        day16 obj = new day16();
        String res = "-4";
        assertEquals(res,obj.eval("-( 3 + ( 2 - 1 ) )"));

    }
}