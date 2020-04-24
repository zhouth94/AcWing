package cn.acwing;

import java.util.Scanner;

/**
 * 输入两个整数n和m，输出一个n行m列的矩阵，将数字 1 到 n*m 按照回字蛇形填充至矩阵中。
 * @author zhou
 *
 */
public class 蛇形矩阵 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()){
			int n = sin.nextInt(); //n行
			int m = sin.nextInt(); //m列
//			int i = 0,j = 0,k = 0,d = 0;
			int[][] res = new int[n][m];
			boolean[][] flag = new boolean[n][m]; //初始化为false
			
			//初始化四个方向
			int[] dx = {0,1,0,-1};
			int[] dy = {1,0,-1,0};
			
			//d表示方向
			for(int x = 0,y = 0,d = 0,k = 1;k <= n*m;k ++){
				res[x][y] = k;
				flag[x][y] = true;
				System.out.println("x:" + x + ",y:" + y +" ==" + res[x][y]);
				int a = x + dx[d]; //表示每次走的格子数
				int b = y + dy[d];
				if(a < 0 || a >= n || b < 0 || b >= m || flag[a][b]){ //判断是否为已经走过的格子，需要变换方向
					//d需要顺时针变换90度方向
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
