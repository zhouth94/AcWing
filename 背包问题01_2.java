package cn.acwing;

import java.util.Scanner;

public class 背包问题01_2 {
	public static void main(String[] args) {
		int[] dp = new int[1001];
		
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
		
		//初始化 dp[v] == 0
		dp[0] = 0;
		
		for(int i = 1;i <= n;i ++) {
			for(int j = v;j >= 1;j --) {
//				dp[j] = dp[j];
				if(tj[i] <= j) {
					System.out.print(dp[j-tj[i]] + "---" + dp[j]);
					//若j从小到大遍历的话，dp[j-tj[i]]的状态值已经算过了
					dp[j] = Math.max(dp[j-tj[i]] + jz[i], dp[j]);
					System.out.print("dp[" + j + "]:" + dp[j] + "\t");
				}
			}
			System.out.println("dp[" + i + "]:" + dp[i]);
		}
		System.out.println(dp[v]);
		
	}

}
