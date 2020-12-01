import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day10Test {   


    @Test
    void test1()
    {

        int a[] ={1,2,3,4,5,6};

        day10 obj = new day10();
        obj.insert(a);
        obj.inorder();
        obj.inverse();
        System.out.println("__");
        obj.inorder();
    }

}