package cn.acwing;

public class 位运算 {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 3; i >= 0; i--) {
			//求n的第k位数字
			System.out.print(n >> i & 1);
		}

	}

}
