package AE.Lec1_Theory;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();// input

        for(int i = 0;i < s.length();i++) {
            System.out.println(s.charAt(i));
        }
    }
}
