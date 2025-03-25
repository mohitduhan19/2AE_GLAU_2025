package AE.Lec5_Lab;
import java.util.Stack;

public class Valid_Paranthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{')st.push(ch);
            else{
                if(st.size() == 0)return false;
                char c = st.peek();

                if( (ch == ')' && c == '(' ) || ( ch == ']' && c == '[' ) || (ch == '}' && c == '{') )st.pop();
                else return false;
            }
        }
        if(st.size() == 0) return true;
        return false;
    }
}
