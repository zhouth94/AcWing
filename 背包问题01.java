package cn.acwing;

import java.util.Scanner;

public class ��������01 {
	public static void main(String[] args) {
		int[][] dp = new int[1001][1001];
		
		int[] tj = new int[1001];
		int[] jz = new int[1001];
		
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt(); //��Ʒ����
		int v = sin.nextInt(); //�����
		
		for (int i = 1; i <= n; i++) {
			tj[i] = sin.nextInt();
			jz[i] = sin.nextInt();
		}
		
		//dp[i][v] ��ʾǰi����Ʒװ������Ϊv�İ�������ֵ
		dp[0][0] = 0;
		
		for(int i = 1;i <= n;i ++) {
			//j�Ӵ�С��������֤j-tj[i]�Ǳ���(i)ѭ��û�б������ģ����������ѭ��(i-1)�Ľ��
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
