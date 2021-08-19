package Solutions;

import java.util.Stack;

public class day16 {


    // Hi, here's your problem today. This problem was recently asked by Google:
    //
    //Given a mathematical expression with just single digits, plus signs,
    // negative signs, and brackets, evaluate the expression.
    // Assume the expression is properly formed.
    //
    //Example:
    //Input: - ( 3 + ( 2 - 1 ) )
    //Output: -4


    String eval(String s) {
        if (s == null) {
            return "";
        }
        char tokens[] = s.toCharArray();

        Stack<Character> operands = new Stack<>();
        Stack<Integer> numbers = new Stack<>();


        for (char ch : tokens) {
            if (ch == ' ') {
                continue;
            }
            if (ch >= '0' && ch <= '9') {
                int x = Character.getNumericValue(ch);
                numbers.push(x);
            }
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                operands.push(ch);

            }
            if (ch == '(') {
                operands.push(ch);
            }
            if (ch == ')') {

                while (operands.peek() != '(') {
                    numbers.push(calculate(operands.pop(), numbers.pop(), numbers.pop()));
                }
                operands.pop();
            }

        }


        char sign = ' ';
        String ans = "";
        if (!operands.isEmpty())
        {
            ans += operands.pop();
        }
        if (!numbers.isEmpty())
        {
            ans += numbers.pop();
        }

        return ans ;

    }
    int calculate(char op,int a,int b) {
        switch (op) {
            case '+': return a+b;
            case '-': return (Math.max(a,b)-Math.min(a,b));
            case '*': return (a*b);
            case '/':if (b == 0)
                throw new
                        UnsupportedOperationException(
                        "Cannot divide by zero");
                return a / b;

        }
        return 0;
    }


}
