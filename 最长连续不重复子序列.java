package cn.acwing;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 最长连续不重复子序列 {

	public static void main(String[] args) {
		int[] s = new int[100010];
		
		Scanner sin = new Scanner(new BufferedInputStream(System.in));
		int n = sin.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sin.nextInt();
		}
		int res = 0;
		/**
		 * i表示终点，从前往后添加
		 * j表示起点
		 */
		for (int i = 0,j = 0; i < n; i++) {
			s[arr[i]] ++;
			System.out.println("s["+arr[i]+"]:" + s[arr[i]]);
			while(j <= i && s[arr[i]] > 1) {
				s[arr[j]] --;
				System.out.println("s[arr[j]]:" + s[arr[j]]);
				j ++;
			}
			res = Math.max(res, i - j + 1);
		}
		System.out.println(res);
	}

}
