package cn.acwing;

import java.util.Scanner;

public class ������Ӳ��_2 {
	public static void main(String[] args) {
		/**
		 * f[i][j]:��ʾ�����j��������������i�εķ����ļ���
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
