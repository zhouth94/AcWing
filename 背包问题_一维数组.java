package cn.acwing;

import java.util.Scanner;

public class ��������_һά���� {
	public static void main(String[] args) {
		int[] dp = new int[1001];
		int[] v = new int[1001]; //���
		int[] w = new int[1001]; //��ֵ
		
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int N = sin.nextInt(); //��Ʒ����
			int V = sin.nextInt(); //�����ݻ�
			
			for (int i = 0; i < N; i++) {
				v[i] = sin.nextInt();
				w[i] = sin.nextInt();
			}
			
			for (int i = 0; i < N; i++) {
				for(int j = V;j >= v[i];j --) {
					dp[j] = Math.max(dp[j], dp[j-v[i]] + w[i]);
					System.out.print(dp[j] + " ");
				}
				System.out.println();
			}
			
			System.out.println(dp[V]);
		}
	}

}
