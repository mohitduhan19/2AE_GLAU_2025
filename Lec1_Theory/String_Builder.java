package AE.Lec1_Theory;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Append text
        sb.insert(6, "Java "); // Insert text
        sb.replace(6, 10, "Beautiful"); // Replace part of the text
        sb.delete(6, 15); // Delete part of the text
        sb.reverse(); // Reverse the string

        System.out.println("Final StringBuilder content: " + sb);
    }
}
