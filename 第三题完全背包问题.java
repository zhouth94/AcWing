package cn.acwing;

import java.util.Scanner;

public class ��������ȫ�������� {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] v = new int[1001];
		int[] w = new int[1001];
		
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt(); //��Ʒ
		int volume = sin.nextInt(); //�����ݻ�
		for(int i = 1;i <= n;i ++) {
			v[i] = sin.nextInt();
			w[i] = sin.nextInt();
		}
		
		int[][] f = new int[1001][1001]; //f[i][j]:��ʾǰi����Ʒ���������j������ֵ
		for(int i = 1;i <= n;i ++) {
			for(int j = 0;j <= volume;j ++) {
				f[i][j] = f[i-1][j]; //��ѡ��i��
				if(j >= v[i]) { //ѡ��i��
					f[i][j] = Math.max(f[i][j], f[i][j-v[i]] + w[i]);
				}
			}
		}
		System.out.println(f[n][volume]);
	}
}
