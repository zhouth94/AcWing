package cn.acwing;

import java.util.Scanner;

public class 完全背包问题 {
	public static void main(String[] args) {
		int[][] dp = new int[1001][1001];
		int[] v = new int[1001];
		int[] w = new int[1001];
		
		Scanner sin = new Scanner(System.in);
		int N = sin.nextInt(); //物品种数
		int V = sin.nextInt(); //背包容积
		
		
		
		dp[0][0] = 0;
		
		for (int i = 1; i <= N; i++) {
			v[i] = sin.nextInt();
			w[i] = sin.nextInt();
		}
		
		for(int i = 1;i <= N;i ++) {
			for(int j = 0;j <= V;j ++) {
				for(int k = 0;k * v[i] <= j;k ++) {
					if(j < v[i]) {
						dp[i][j] = dp[i-1][j];
					}
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-v[i]*k] + w[i]*k);
				}
			}
		}
		
		int max = 0;
		for (int i = 1; i < V; i++) {
			max= Math.max(max, dp[N][i]);
		}
		System.out.println(dp[N][V]);
	}

}
