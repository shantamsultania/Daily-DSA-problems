import java.util.Stack;

public class day2 {

    //Hi, here's your problem today. This problem was recently asked by Uber:
    //
    //Imagine you are building a compiler. Before running any code, the compiler must check that the parentheses in the program are balanced. Every opening bracket must have a corresponding closing bracket. We can approximate this using strings.
    //
    //Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //An input string is valid if:
    //- Open brackets are closed by the same type of brackets.
    //- Open brackets are closed in the correct order.
    //- Note that an empty string is also considered valid.
    //
    //Example:
    //Input: "((()))"
    //Output: True
    //
    //Input: "[()]{}"
    //Output: True
    //
    //Input: "({[)]"
    //Output: False



    boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char first = stack.pop();
                if (ch == ']' && first != '[')
                {
                    return false;
                }
                if (ch == '}' && first != '{')
                {
                    return false;
                }
                if (ch == ')' && first != '(')
                {
                    return false;
                }


            }
        }


        return true;
    }


}
