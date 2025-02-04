package AE.Lec2_Theory;

public class Min_Cost_Climbing_Stair {
    public int help(int[]cost , int idx){
        if(idx >= cost.length)return 0;
        int x = help(cost , idx + 1) + cost[idx];
        int y = help(cost , idx + 2) + cost[idx];
        return Math.min(x , y);
    }
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(help(cost , 0) , help(cost ,1));
    }
}
