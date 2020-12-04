public class day15 {

    //Hi, here's your problem today. This problem was recently asked by AirBNB:
    //
    //Given two strings, determine the edit distance between them.
    // The edit distance is defined as the minimum number of edits
    // (insertion, deletion, or substitution)
    // needed to change one string to the other.
    //
    //For example, "biting" and "sitting" have an edit distance of
    // 2 (substitute b for s, and insert a t).
    //
    //Here's the signature:
    //
    //def distance(s1, s2):
    //  # Fill this in.
    //
    //print distance('biting', 'sitting')
    //# 2

    int min(int x,int y,int z)
    {
        if (x<= y && x <=z)
        {
            return x;
        }
        else
        {
            return Math.min(y, z);
        }
    }

    int distance(String s1,String s2)
    {
        if (s1.equals(s2))
        {
            return 0;
        }
        int dp[][] = new int[s1.length() +1][s2.length() +1];

        for (int i= 0;i<=s1.length();i++)
        {
            for (int j=0;j<=s2.length();j++)
            {
                if (i==0)
                {
                    dp[i][j] = j;
                }
                else if(j== 0)
                {
                    dp[i][j] = i;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = 1+min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];


    }


}
