package AE.Lec1_Theory;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Append text
        sb.insert(6, "Java "); // Insert text
        sb.replace(6, 10, "Beautiful"); // Replace part of the text
        sb.delete(6, 15); // Delete part of the text
        sb.reverse(); // Reverse the string

        System.out.println("Final StringBuffer content: " + sb);
    }
}