package cn.acwing;

import java.util.Scanner;

public class ������Ӳ�� {
	public static void main(String[] args) {
		int N = 110, M = 11;
		int[][] dp = new int[N][M];
		
		Scanner sin = new Scanner(System.in);
		
		while(sin.hasNext()) {
			int n = sin.nextInt(); //¥��߶�
			int m = sin.nextInt(); //��������
			
			/**
			 * ʹ��dp:
			 * f[i][j]��ʾ����¥������ĸ߶ȷ�Χ����Ӳ��Ϊi,����j�������ļ���
			 * i��1��ʼ���㣬i==1��ʾӲ��Ϊ1
			 */
			
			//��ʼ��
			for (int i = 1; i <= n; i++) {
				dp[i][1] = i;
			}
			for (int j = 1; j <= m; j++) {
				dp[1][j] = 1;
			}
			
			//�Ӹ߶�Ϊ2��ʼ
			for (int i = 2; i <= n; i++) {
				for(int j = 2;j <= m;j ++) {
					dp[i][j] = dp[i][j-1]; //���õ�j������
					//�õ�j�����������
					//���ڵ�k��ĸ߶��׼������ַ�Ϊ��
					// 1.�������ˣ�dp[i][j] = dp[k-1][j-1]
					// 2.����û�飺dp[i][j] = dp[i-k][j]
					for (int k = 1; k <= i; k++) {
						dp[i][j] = Math.min(dp[i][j], Math.max(dp[k-1][j-1], dp[i-k][j]) + 1 );
					}
				}
			}
			System.out.println(dp[n][m]);
		}
	}

}
