import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommonCharactersQuestionTest {


    @Test
    public  void testCommonCharacterQuestion(){

        CommonCharactersQuestion commonCharactersQuestion = new CommonCharactersQuestion();
        List<String> inputData = new ArrayList<>(Arrays.asList("google", "facebook", "youtube"));
        commonCharactersQuestion.commonCharacters(inputData);


    }

}