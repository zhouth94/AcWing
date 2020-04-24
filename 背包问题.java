package cn.acwing;

import java.util.Scanner;

public class 背包问题 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int[][] dp = new int[1001][1001];
		int[] v = new int[1001]; //物品的体积
		int[] w = new int[1001]; //物品的价值
		
		while(sin.hasNext()) {
			int N = sin.nextInt(); //物品数量
			int V = sin.nextInt(); //背包容积
			
			for (int i = 1; i <= N; i++) {
				v[i] = sin.nextInt();
				w[i] = sin.nextInt();
			}
			
			for (int i = 1; i <= N; i++) {
				//每次算出来二维数组f[i][0...V]的所有值
				for (int j = 0; j <= V; j++) { //背包的容量从0递增的
					if(j < v[i]) { //第i个物品的重量 > 背包重量j
						dp[i][j] = dp[i-1][j];
					}else {
						//将前i件物品放入容量为j的背包
						dp[i][j] = Math.max(dp[i-1][j], (dp[i-1][j-v[i]] + w[i]));
					}
				}
			}
			
			System.out.println(dp[N][V]);
		}
	}

	
}
