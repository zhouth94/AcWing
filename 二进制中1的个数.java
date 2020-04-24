package cn.acwing;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class ��������1�ĸ��� {
	/**
	 * ��x�Ķ���������ʾ�����һλ1
	 * 
	 * @param x 
	 * ��xת���ɶ����Ʊ�ʾ, -x���ʾx�Ĳ���
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
