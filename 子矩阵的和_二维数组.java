package cn.acwing;

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class �Ӿ���ĺ�_��ά���� {
	public static void main(String[] args) {
		Scanner sin = new Scanner(new BufferedInputStream(System.in));
		int n = sin.nextInt();
		int m = sin.nextInt();
		int q = sin.nextInt();
		
		int[][] arr = new int[n+1][m+1];
		int[][] s = new int[n+1][m+1];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = sin.nextInt();
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				/**
				 * ��ǰ׺�� 
				 * ���ƣ�s[i] = s[i-1] + a[i]
				 */
				s[i][j] = s[i][j-1] + s[i-1][j] - s[i-1][j-1] + arr[i][j];
			}
		}
		while(q -- > 0) {
			int x1 = sin.nextInt();
			int y1 = sin.nextInt();
			int x2 = sin.nextInt();
			int y2 = sin.nextInt();
			/**
			 * �󲿷������
			 * ���ƣ�s[r] - s[l-1]
			 */
			System.out.println(s[x2][y2] - s[x1-1][y2] - s[x2][y1-1] + s[x1-1][y1-1]);
		}
		
	}
	
}
