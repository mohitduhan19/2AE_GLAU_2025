package AE.Lec5_Lab;
import java.util.Stack;

public class Next_Greater_Element {
    public static long[] nextLargerElement(long[] arr, int n){
        Stack<Long> s = new Stack<>();
        long[] nge = new long[arr.length];
        s.push(arr[arr.length-1]);

        for(int i = arr.length-2;i>=0;i--){
            while(s.size() > 0 && arr[i] >= s.peek()){
                s.pop();
            }
            if(s.size() == 0)nge[i] = -1;
            else nge[i] = s.peek();

            s.push(arr[i]);
        }
        return nge;
    }
}
