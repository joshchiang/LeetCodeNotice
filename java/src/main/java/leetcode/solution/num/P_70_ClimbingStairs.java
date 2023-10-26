package leetcode.solution.num;

import java.util.HashMap;

public class P_70_ClimbingStairs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		P_70_ClimbingStairs test = new P_70_ClimbingStairs();

		System.out.println(":" + test.climbStairs(n));

	}

	public int climbStairs(int n) {

		if (n <= 1) {
			return n;
		}

		int total = 1;
		int b1 = 0;
		int b2 = 1;

		for (int i = 1; i <= n; i++) {
			total = b1 + b2;
			b1 = b2;
			b2 = total;
		}

		return total;
	}
	// ---------
	HashMap<Integer, Integer> map=new HashMap();
    public int climbStairsLee(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        if(!map.containsKey(n)) map.put(n, climbStairsLee(n-1)+climbStairsLee(n-2));
        
         return map.get(n);

    }

}
