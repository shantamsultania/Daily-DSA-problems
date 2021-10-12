package GeeksForGeeksPractice;

import java.util.ArrayList;

public class mathematicsProblems {


    public long hcf(long a, long b) {
        if (a == 0) {
            return b;
        }
        return hcf(b % a, a);
    }

    public long lcm(long a, long b) {
        return (a * b) / hcf(a, b);
    }

    public long findSmallesetDivisibleNumber(int n) {
        long lcm = 1;
        for (int i = 1; i <= n; i++) {
            lcm = lcm(lcm, i);
        }
        return lcm;
    }

    public long sumUnderModulo(long a, long b) {
        // code here

        long mod = 1000000007;

        return (a % mod + b % mod) % mod;

    }

    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here

        ArrayList<Integer> result = new ArrayList<>();

        int temp = (int) (Math.pow(b, 2) - (4 * a * c));

        if (temp < 0) {
            // Roots are imaginary
            return result;

        } else {

            int root1 = 0, root2 = 0;

            root1 = (int) Math.floor(((b * -1) + Math.sqrt(temp)) / (2 * a));
            root2 = (int) Math.floor(((b * -1) - Math.sqrt(temp)) / (2 * a));

            result.add(Math.max(root1, root2));
            result.add(Math.min(root1, root2));

        }


        return result;

    }


}
