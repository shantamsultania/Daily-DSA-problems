package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Question
//
//        Given a phone number, return all valid words that can be created using that phone number.
//
//        For instance, given the phone number 364
//        we can construct the words ['dog', 'fog'].
//
//        Here's a starting point:
//
//        lettersMaps = {
//        1: [],
//        2: ['a', 'b', 'c'],
//        3: ['d', 'e', 'f'],
//        4: ['g', 'h', 'i'],
//        5: ['j', 'k', 'l'],
//        6: ['m', 'n', 'o'],
//        7: ['p', 'q', 'r', 's'],
//        8: ['t', 'u', 'v'],
//        9: ['w', 'x', 'y', 'z'],
//        0: []
//        }
//
//        validWords = ['dog', 'fish', 'cat', 'fog']
//
//        def makeWords(phone):
//        #Fill this in
//
//        print(makeWords('364'))
//        # ['dog', 'fog']


public class phoneNumbersQuestion {

    public List<String> validWords = new ArrayList<>(Arrays.asList("dog", "fish", "cat", "fog"));
    private final Character[][] numberToCharMap;

    public phoneNumbersQuestion() {

        numberToCharMap = new Character[10][5];
        numberToCharMap[0] = new Character[]{'\0'};
        numberToCharMap[1] = new Character[]{'\0'};
        numberToCharMap[2] = new Character[]{'a', 'b', 'c'};
        numberToCharMap[3] = new Character[]{'d', 'e', 'f'};
        numberToCharMap[4] = new Character[]{'g', 'h', 'i'};
        numberToCharMap[5] = new Character[]{'j', 'k', 'l'};
        numberToCharMap[6] = new Character[]{'m', 'n', 'o'};
        numberToCharMap[7] = new Character[]{'p', 'q', 'r', 's'};
        numberToCharMap[8] = new Character[]{'t', 'u', 'v'};
        numberToCharMap[9] = new Character[]{'w', 'x', 'y', 'z'};
    }

    public List<String> makeWords(String phoneNumber, String s, int numIndex) {

        List<String> res = new ArrayList<>();
        List<Integer> number = new ArrayList<>();

        if (phoneNumber != null) {

            for (int i = 0; i < phoneNumber.length(); i++) {
                int x = phoneNumber.charAt(i) - '0';
                if (x > 9 || x < 0) {
                    System.out.println("invalid number");
                    break;
                }
                number.add(x);
            }

            // Exit condition
            if (number.size() == numIndex) {
                res.add(s);
                return res;
            }
            for (int i = 0; i < numberToCharMap[number.get(numIndex)].length; i++) {

                String copyString = String.copyValueOf(s.toCharArray());
                copyString = copyString.concat(numberToCharMap[number.get(numIndex)][i].toString());
                res.addAll(makeWords(phoneNumber, copyString, numIndex + 1));

            }

        }

        return res;
    }



}
