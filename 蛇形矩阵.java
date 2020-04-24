package cn.acwing;

import java.util.Scanner;

/**
 * ������������n��m�����һ��n��m�еľ��󣬽����� 1 �� n*m ���ջ�����������������С�
 * @author zhou
 *
 */
public class ���ξ��� {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()){
			int n = sin.nextInt(); //n��
			int m = sin.nextInt(); //m��
//			int i = 0,j = 0,k = 0,d = 0;
			int[][] res = new int[n][m];
			boolean[][] flag = new boolean[n][m]; //��ʼ��Ϊfalse
			
			//��ʼ���ĸ�����
			int[] dx = {0,1,0,-1};
			int[] dy = {1,0,-1,0};
			
			//d��ʾ����
			for(int x = 0,y = 0,d = 0,k = 1;k <= n*m;k ++){
				res[x][y] = k;
				flag[x][y] = true;
				System.out.println("x:" + x + ",y:" + y +" ==" + res[x][y]);
				int a = x + dx[d]; //��ʾÿ���ߵĸ�����
				int b = y + dy[d];
				if(a < 0 || a >= n || b < 0 || b >= m || flag[a][b]){ //�ж��Ƿ�Ϊ�Ѿ��߹��ĸ��ӣ���Ҫ�任����
					//d��Ҫ˳ʱ��任90�ȷ���
					d = (d + 1)%4;
					a = x + dx[d];
					b = y + dy[d];
				}
				x = a;
				y = b;
			}
			
			System.out.println("---------------------------");
			for(int i = 0;i < n;i ++){
				for(int j = 0;j < m;j ++){
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
			}
			
		}
	}

}
