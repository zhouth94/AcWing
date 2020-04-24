package cn.acwing;

import java.util.Scanner;

public class 前缀和_一维数组 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt(); //长度为n的整数序列
		int m = sin.nextInt(); //m个询问
		
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sin.nextInt();
		}
		
		int[] sum = new int[n + 1];
		sum[0] = 0;
		for (int i = 1; i <= n; i++) {
			sum[i] = sum[i - 1] + num[i - 1];
			/*System.out.print(num[i-1]);
			System.out.print(sum[i]);*/
		}
		
		while(m-- > 0) {
			int l = sin.nextInt();
			int r = sin.nextInt();
			
			if(l <= n && r <= n) {
				int res = sum[r] - sum[l - 1];
				System.out.println(res);
			}
		}
		
	}

}
