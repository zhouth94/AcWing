package cn.acwing;

import java.util.Scanner;

public class 鸡蛋的硬度 {
	public static void main(String[] args) {
		int N = 110, M = 11;
		int[][] dp = new int[N][M];
		
		Scanner sin = new Scanner(System.in);
		
		while(sin.hasNext()) {
			int n = sin.nextInt(); //楼层高度
			int m = sin.nextInt(); //鸡蛋个数
			
			/**
			 * 使用dp:
			 * f[i][j]表示所有楼层区间的高度范围长度硬度为i,且有j个鸡蛋的集合
			 * i从1开始计算，i==1表示硬度为1
			 */
			
			//初始化
			for (int i = 1; i <= n; i++) {
				dp[i][1] = i;
			}
			for (int j = 1; j <= m; j++) {
				dp[1][j] = 1;
			}
			
			//从高度为2开始
			for (int i = 2; i <= n; i++) {
				for(int j = 2;j <= m;j ++) {
					dp[i][j] = dp[i][j-1]; //不用第j个鸡蛋
					//用第j个鸡蛋的情况
					//设在第k层的高度抛鸡蛋，又分为：
					// 1.鸡蛋碎了：dp[i][j] = dp[k-1][j-1]
					// 2.鸡蛋没碎：dp[i][j] = dp[i-k][j]
					for (int k = 1; k <= i; k++) {
						dp[i][j] = Math.min(dp[i][j], Math.max(dp[k-1][j-1], dp[i-k][j]) + 1 );
					}
				}
			}
			System.out.println(dp[n][m]);
		}
	}

}
