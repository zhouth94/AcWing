package cn.acwing;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 第k个数_快速选择算法 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(new BufferedInputStream(System.in));
		int n = sin.nextInt();
		int k = sin.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sin.nextInt();
		}
//		quickSort(arr, 0, n-1);
		quick_sort(arr, 0, n-1, k);
		System.out.println(arr[k - 1]);
			
	}

	private static int quick_sort(int[] arr, int l, int r, int k) {
		if(l == r) 
			return arr[l];
		int i = l, j = r;
		int x = arr[l];
		while(i < j) {
			while(i < j && arr[j] >= x) j --;
			while(i < j && arr[i] <= x) i ++;
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int count = i - l + 1;
		if(k <= count)
			return quick_sort(arr, l, i, k);
		else
			return quick_sort(arr, i + 1, r, k - count);
		
	}

	private static void quickSort(int[] arr, int l, int r) {
		if(l >= r) return;
		
		//快速排序
		int i = l, j = r;
		int standard = arr[l];
		while(l < r) {
			//先进行右侧的判断，才能保证退出循环时l指向小的那个数字
			while(l < r && arr[r] >= standard) {
				r --;
			}
			while(l < r && arr[l] <= standard) {
				l ++;
			}
			if(l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
		arr[i] = arr[l];
		arr[l] = standard;
		quickSort(arr, i, l - 1);
		quickSort(arr, l + 1, j);
	}
	

}
