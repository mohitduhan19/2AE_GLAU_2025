package AE.Lec1_Theory;

import java.util.StringTokenizer;
public class String_Tokenizer {
    public static void main(String[] args) {
        String str = "Java,Python,C++,JavaScript";
        StringTokenizer st = new StringTokenizer(str, ",");

        System.out.println("Tokens are:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
