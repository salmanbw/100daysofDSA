package days100;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){

        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        int n = ch.length;
        for(int i =0;i<n;i++){

            if(ch[i] == '{' || ch[i] == '[' || ch[i] == '('){
                stack.add(ch[i]);
            }else if (!stack.isEmpty()){
                if(ch[i] == '}' && stack.pop() != '{')
                    return false;
                if(ch[i] == ']' && stack.pop() != '[')
                    return false;
                if(ch[i] == ')' && stack.pop() != '(')
                    return false;
            }else{
                return false;
            }
        }
        if(!stack.isEmpty())
            flag = false;


        return flag;
    }
}


