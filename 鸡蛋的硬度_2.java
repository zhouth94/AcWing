package cn.acwing;

import java.util.Scanner;

public class 鸡蛋的硬度_2 {
	public static void main(String[] args) {
		/**
		 * f[i][j]:表示最多用j个鸡蛋，最多测量i次的方案的集合
		 */
		int N = 110,M = 11;
		int[][] dp = new int[N][M];
		
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int n = sin.nextInt();
			int m = sin.nextInt();
			
			for(int i = 1;i <= n;i ++) dp[i][1] = i;
			for(int i = 1;i <= m;i ++) dp[1][i] = 1;
			
			for(int i = 2;i <= n;i ++) {
				
			}
			
		}
		
	}

}
