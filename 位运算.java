package cn.acwing;

public class λ���� {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 3; i >= 0; i--) {
			//��n�ĵ�kλ����
			System.out.print(n >> i & 1);
		}

	}

}
