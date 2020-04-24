package cn.acwing;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 数的三次方根 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(new BufferedInputStream(System.in));
		double n = sin.nextDouble();
		double l = -1 * 10000D, r = 10000D;
		while(r - l > 1e-8) {
			double mid = (l + r) / 2;
			if(mid * mid * mid <= n)
				l = mid;
			else
				r = mid;
		}
		System.out.println(String.format("%.6f", l));
	}

}
