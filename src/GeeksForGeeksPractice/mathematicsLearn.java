package GeeksForGeeksPractice;

public class mathematicsLearn {


    // find the count of digits present in this number.

    public int learn1Approch1(int n) {


        if (n < 1) {
            return 0;
        } else if (n >= 1 && n <= 9) {
            return 1;
        } else {
            int res = 0;

            while (n != 0) {
                res++;
                n = n / 10;
            }
            return res;
        }

    }

    public int learn1Approch2(int n) {

        if (n < 1) {
            return 0;
        } else if (n >= 1 && n <= 9) {
            return 1;
        } else {
            int res = 0;

            res = (int) Math.floor(Math.log10(n) + 1);

            return res;
        }


    }

    // find if number i prime or not

    public boolean learn2Approch2(int n) {

        int tempArry[] = new int[n + 1];
        if (n <= 0) {
            return false;
        } else if (n > 0 && n <= 2) {
            return true;
        } else {

            for (int i = 2; i < n + 1; i++) {

                if (tempArry[i] == -1) {
                    continue;
                }
                for (int j = i + 1; j < n + 1; j++) {
                    if (j % i == 0 && j > (i * i)) {
                        tempArry[j] = -1;
                    }
                }

            }
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.println(i+", "+tempArry[i]);
        }

        if (tempArry[n] == -1) {
            return false;
        } else {
            return true;
        }

    }

}
