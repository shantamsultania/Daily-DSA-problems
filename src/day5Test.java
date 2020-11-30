import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day5Test {

    @Test
    void test1()
    {
        int a[] = {1,2,3,4};
        day5 obj = new day5();
        obj.insert(a);
        obj.printall();
        System.out.println();
        System.out.println("__________________");
        System.out.println();
        obj.re();
    } @Test
    void test2()
    {
        int a[] = {1,1,1,1};
        day5 obj = new day5();
        obj.insert(a);
        obj.printall();
        System.out.println();
        System.out.println("__________________");
        System.out.println();
        obj.re();
    }
    @Test
    void test3()
    {
        int a[] = {11,10,9,8,7,6,5,4,3,2,1};
        day5 obj = new day5();
        obj.insert(a);
        obj.printall();
        System.out.println();
        System.out.println("__________________");
        System.out.println();
        obj.re();
    }
    @Test
    void test4()
    {
        int a[] = {11,10,9,8};
        day5 obj = new day5();
        obj.insert(a);
        obj.printall();
        System.out.println();
        System.out.println("__________________");
        System.out.println();
        obj.re();
    }

}