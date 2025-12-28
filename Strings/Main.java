package Strings;

public class Main {
    //Remove Outermost Parentheses
    public static String RemoveOutermostParentheses(String s){
        String result = "";
        int count = 0;

        for(int i = 0 ; i< s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(count > 0){
                    result += ch;
                }
                count++;
            }else{
                count--;
                if(count > 0){
                    result += ch;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.print(RemoveOutermostParentheses(s));
    }
}
