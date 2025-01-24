package AE.Lec1_Theory;

public class Reverse_String {
    public void reverseString(char[] s) {

        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            char temp = s[i];
            // Replace the character at index i with the character at index j.
            s[i] = s[j];
            // Replace the character at index j with the character in the temporary variable (temp).
            s[j] = temp;
        }
    }
}
