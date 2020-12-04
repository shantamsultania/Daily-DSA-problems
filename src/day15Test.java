import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day15Test {


    @Test
    void test1()
    {
        day15 obj = new day15();
        assertEquals(2,obj.distance("biting","sitting"));
    }

}