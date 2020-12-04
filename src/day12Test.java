import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day12Test {


    @Test
    void test1()
    {
        day12 ob = new day12();
        ob.getmax();
        ob.push(10);
        ob.push(20);
        ob.push(2);
        ob.peek();
        ob.getmax();
        ob.pop();
    }

}