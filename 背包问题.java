package cn.acwing;

import java.util.Scanner;

public class �������� {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int[][] dp = new int[1001][1001];
		int[] v = new int[1001]; //��Ʒ�����
		int[] w = new int[1001]; //��Ʒ�ļ�ֵ
		
		while(sin.hasNext()) {
			int N = sin.nextInt(); //��Ʒ����
			int V = sin.nextInt(); //�����ݻ�
			
			for (int i = 1; i <= N; i++) {
				v[i] = sin.nextInt();
				w[i] = sin.nextInt();
			}
			
			for (int i = 1; i <= N; i++) {
				//ÿ���������ά����f[i][0...V]������ֵ
				for (int j = 0; j <= V; j++) { //������������0������
					if(j < v[i]) { //��i����Ʒ������ > ��������j
						dp[i][j] = dp[i-1][j];
					}else {
						//��ǰi����Ʒ��������Ϊj�ı���
						dp[i][j] = Math.max(dp[i-1][j], (dp[i-1][j-v[i]] + w[i]));
					}
				}
			}
			
			System.out.println(dp[N][V]);
		}
	}

	
}
