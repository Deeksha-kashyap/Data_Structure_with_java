package main;
import java.util.Stack;


public class ValidSubstring {
    static int findMaxLen(String str)
    {
        int n=str.length();
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int res=0;
        for(int i=0;i<n;i++)
        {
            if (str.charAt(i) == '(')
            { stack.push(i);}
            else
            {
                stack.pop();
                if(!stack.empty())
                    res=Math.max(res,i-stack.peek());
                else stack.push(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "((()()";
        System.out.println(findMaxLen(str));

        str = "()(()))))";
        System.out.println(findMaxLen(str));
    }
}
