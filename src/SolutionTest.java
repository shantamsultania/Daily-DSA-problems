import Solutions.Questions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Questions questions = new Questions();

    @Test
    public void testQuestionName() {
        System.out.println("testing solutions here ");
    }

    @Test
    public void testFindSingleElement() {
        int a[] = {7, 3, 5, 5, 4, 3, 4, 8, 8};
        assertEquals(7, questions.findSingleElement(a));
    }

    @Test
    public void testCountPrime() {
        int n = 10;
        assertEquals(4, questions.countPrimes(n));
    }

}