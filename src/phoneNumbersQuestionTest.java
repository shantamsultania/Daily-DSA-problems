import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class phoneNumbersQuestionTest {

    @Test
    void test1()
    {
        phoneNumbersQuestion phoneNumbersQuestion = new phoneNumbersQuestion();
        List<String> allPossibleWords = phoneNumbersQuestion.makeWords("364", "", 0);
        for (String word : allPossibleWords) {
            if (phoneNumbersQuestion.validWords.contains(word)) {
                System.out.println(word);
            }
        }
    }
}