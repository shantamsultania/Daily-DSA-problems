package GeeksForGeeksPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mathematicsLearnTest {

    mathematicsLearn mathematicsLearn = new mathematicsLearn();

    @Test
    public void testLearn1() {


        // Approach 1 test

        assertEquals(3, mathematicsLearn.learn1Approch1(111));

        // Approach 2 test
        assertEquals(4, mathematicsLearn.learn1Approch2(1112));


    }

    @Test
    public void testlearn2(){

        assertTrue(mathematicsLearn.learn2Approch2(11));
    }

}