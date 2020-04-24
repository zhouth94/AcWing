package cn.acwing;

import java.util.Scanner;

public class 背包问题01 {
	public static void main(String[] args) {
		int[][] dp = new int[1001][1001];
		
		int[] tj = new int[1001];
		int[] jz = new int[1001];
		
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt(); //物品数量
		int v = sin.nextInt(); //总体积
		
		for (int i = 1; i <= n; i++) {
			tj[i] = sin.nextInt();
			jz[i] = sin.nextInt();
		}
		
		//dp[i][v] 表示前i件物品装入容量为v的包的最大价值
		dp[0][0] = 0;
		
		for(int i = 1;i <= n;i ++) {
			//j从大到小遍历，保证j-tj[i]是本次(i)循环没有遍历到的，额就是上轮循环(i-1)的结果
			for(int j = v;j >= 0;j --) {
				dp[i][j] = dp[i-1][j];
				if(tj[i] <= j) {
					dp[i][j] = Math.max(dp[i-1][j-tj[i]] + jz[i], dp[i][j]);
				}
			}
		}
		System.out.println(dp[n][v]);
		
	}

}
