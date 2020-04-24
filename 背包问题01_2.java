package cn.acwing;

import java.util.Scanner;

public class ��������01_2 {
	public static void main(String[] args) {
		int[] dp = new int[1001];
		
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
		
		//��ʼ�� dp[v] == 0
		dp[0] = 0;
		
		for(int i = 1;i <= n;i ++) {
			for(int j = v;j >= 1;j --) {
//				dp[j] = dp[j];
				if(tj[i] <= j) {
					System.out.print(dp[j-tj[i]] + "---" + dp[j]);
					//��j��С��������Ļ���dp[j-tj[i]]��״ֵ̬�Ѿ������
					dp[j] = Math.max(dp[j-tj[i]] + jz[i], dp[j]);
					System.out.print("dp[" + j + "]:" + dp[j] + "\t");
				}
			}
			System.out.println("dp[" + i + "]:" + dp[i]);
		}
		System.out.println(dp[v]);
		
	}

}
