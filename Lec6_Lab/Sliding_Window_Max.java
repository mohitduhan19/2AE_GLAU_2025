package AE.Lec6_Lab;
import java.util.*;
public class Sliding_Window_Max {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;

        for(int i = 0; i< nums.length;i++){
            if(q.size() > 0 && q.getFirst() <= i - k){
                q.removeFirst();
            }

            while(q.size() > 0 && nums[q.getLast()] < nums[i]){
                q.removeLast();
            }
            q.addLast(i);

            if(i >= k - 1){
                res[index++] = nums[q.getFirst()];
            }
        }
        return res;
    }
}
