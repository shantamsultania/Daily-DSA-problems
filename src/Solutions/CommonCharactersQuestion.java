package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharactersQuestion {


    // Hi, here's your problem today. This problem was recently asked by Apple:
    //
    // Given a list of strings, find the list of characters that appear in all strings.
    //
    // Here's an example and some starter code:
    //
    // ['google', 'facebook', 'youtube']
    // ['e', 'o']

    public List<Character> commonCharacters(List<String> input){

        List<Character> result = new ArrayList<>();
        HashMap<Character,Integer> tempMap = new HashMap<>();

        for(int i=0;i<input.get(0).length();i++){
            char ch = input.get(0).charAt(i);
            if(tempMap.containsKey(ch)){
                tempMap.put(ch,tempMap.get(ch)+1);
            }else{
                tempMap.put(ch,1);

            }
        }
        for(int i=1;i<input.size();i++){
            String s = input.get(i);
            HashMap<Character,Integer> tempMap2 = new HashMap<>();

            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                if(!tempMap.containsKey(ch)){
                    continue;
                }else{
                    if(!tempMap2.containsKey(ch)){
                        tempMap2.put(ch,1);
                    }else{
                        tempMap2.put(ch,Math.min(tempMap.get(ch),tempMap2.get(ch)+1));
                    }
                }
            }
           tempMap = tempMap2;
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : tempMap.entrySet()) {
                result.add(characterIntegerEntry.getKey());
                System.out.println(characterIntegerEntry.getKey()+" "+characterIntegerEntry.getValue());
        }


        return  result;

    }

}
