package Soliutions;

import java.net.Inet4Address;
import java.util.HashMap;

public class day4 {

    //Hi, here's your problem today. This problem was recently asked by Microsoft:
    //
    //Given a string, find the length of the longest substring without repeating characters.
    //
    //class Solution:
    //  def lengthOfLongestSubstring(self, s):
    //    # Fill this in.
    //
    //print Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx')
    //# 10

    int lengthoflongestsubstring(String s )
    {

        HashMap<Character, Integer> hm = new HashMap<>();

        int ans = 0;

        for(int i=0,j=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (hm.containsKey(ch))
            {
                j = Math.max(hm.get(ch),j);
            }
            ans = Math.max(ans,i-j+1);
            hm.put(ch,i+1);
        }


        return ans;
    }

}
