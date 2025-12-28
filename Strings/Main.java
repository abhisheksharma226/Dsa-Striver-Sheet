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


    //Reverse Words in a String
    public static String ReverseWords(String s){
        String word[] = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i = word.length-1; i >= 0; i --){
            sb.append(word[i]);
            if( i != 0) sb.append(" ");
        }
        return sb.toString();
    }



    public static void main(String[] args) {

        // //REmove outer most parentheses
        // String s = "(()())(())";
        // System.out.print(RemoveOutermostParentheses(s));

        //REvers words in string
        String sentence = "I am from India";
        System.out.print(ReverseWords(sentence));
    }
}
