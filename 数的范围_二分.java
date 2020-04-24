package cn.acwing;

import java.util.Scanner;

public class 数的范围_二分 {
	public void binarySearch(int[] arr,int[] target) {
		for (int i = 0; i < target.length; i++) {
			int num = target[i];
			int l = 0,r = arr.length - 1;
			while(l < r) {
				int mid = l + r >> 1;
				if(arr[mid] >= num)  //check(mid) 选择答案所在的区间进行处理
					r = mid;
				else 
					l = mid +1;
			}
			if(arr[l] != num) System.out.println("-1 -1");
			else {
				System.out.print(l + " ");
				l = 0;r = arr.length - 1;
				while(l < r) {
					int mid = l + r + 1 >> 1;
					if(arr[mid] <= num) //check(mid) 选择答案所在的区间进行处理
						l = mid;
					else 
						r = mid - 1;
				}
				System.out.print(l);
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		数的范围_二分 s = new 数的范围_二分();
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt();
		int q = sin.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sin.nextInt();
		}
		int[] target = new int[q];
		for (int i = 0; i < q; i++) {
			target[i] = sin.nextInt();
		}
		s.binarySearch(arr, target);
	}

}
