package cn.acwing;

import java.util.Scanner;

public class 第三题完全背包问题 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] v = new int[1001];
		int[] w = new int[1001];
		
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt(); //物品
		int volume = sin.nextInt(); //背包容积
		for(int i = 1;i <= n;i ++) {
			v[i] = sin.nextInt();
			w[i] = sin.nextInt();
		}
		
		int[][] f = new int[1001][1001]; //f[i][j]:表示前i件物品体积不超过j的最大价值
		for(int i = 1;i <= n;i ++) {
			for(int j = 0;j <= volume;j ++) {
				f[i][j] = f[i-1][j]; //不选第i件
				if(j >= v[i]) { //选第i件
					f[i][j] = Math.max(f[i][j], f[i][j-v[i]] + w[i]);
				}
			}
		}
		System.out.println(f[n][volume]);
	}
}
