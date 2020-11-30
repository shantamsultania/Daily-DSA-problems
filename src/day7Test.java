import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day7Test {



    @Test
    void tet1()
    {
        int a[] = {4, 7, 1 , -3, 2};
        day7 obj = new day7();
        assertTrue(obj.twosum(a,5));

    }

}