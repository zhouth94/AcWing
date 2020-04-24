package cn.acwing;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 二进制中1的个数 {
	/**
	 * 求x的二进制数表示的最后一位1
	 * 
	 * @param x 
	 * 将x转化成二进制表示, -x则表示x的补码
	 * @return
	 */
	public static int lowbit(int x) {
		return x & -x;
	}
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(new BufferedInputStream(System.in));
		int n = sin.nextInt();
		while(n -- >= 1) {
			int x = sin.nextInt();
			int cnt = 0;
			while(x > 0) {
				x -= lowbit(x);
				cnt ++;
			}
			System.out.print(cnt + " ");
		}
	}

}
