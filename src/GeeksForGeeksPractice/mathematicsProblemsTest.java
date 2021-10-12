package GeeksForGeeksPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class mathematicsProblemsTest {

    mathematicsProblems mathematicsProblems = new mathematicsProblems();

    @Test
    public void testProblem(){

        // Question 1
        assertEquals(60,mathematicsProblems.findSmallesetDivisibleNumber(6));

        // Question 2

//        assertEquals(582344006,mathematicsProblems.sumUnderModulo(9223372036854775807,9223372036854775807));

        // Question 3

        ArrayList<Integer> resultProblem3 = new ArrayList<>(Arrays.asList(1,1));

        assertEquals(resultProblem3,mathematicsProblems.quadraticRoots(1,-2,1));

    }
}