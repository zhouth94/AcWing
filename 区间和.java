package cn.acwing;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 使用离散化方法求解：
 * 1.数组排序
 * 2.数组去重
 * 3.二分求出x对应的离散化的值
 * @author zhou
 *
 */

class Pair{
	int first;
	int second;
	public Pair(int first,int second) {
		this.first = first;
		this.second = second;
	}
}

public class 区间和 {
	public static int unique(List<Integer> alls) {
		int j = 0;
		for(int i = 0;i < alls.size();i ++) {
			if(i == 0 || alls.get(i) != alls.get(i - 1)) {
				alls.set(j, alls.get(i));
				j ++;
			}
		}
		return j;
	}


	public static void main(String[] args) {
		Scanner sin = new Scanner(new BufferedInputStream(System.in));
		int n = sin.nextInt(); //n 次操作
		int m = sin.nextInt(); //m 次询问
		
		int N = 300010; //需要将每次操作的数x 和 每次询问的俩个区间端点l、r存入数组 ，每一个100000
		int[] arr = new int[N]; //原数组
		int[] s = new int[N]; //前缀和数组
		
		List<Integer> alls = new ArrayList<>();  //保存所有需要离散化的值，即每次操作的数x 和 每次询问的俩个区间端点l、r
		
		List<Pair> addList = new ArrayList<>(); //保存插入操作的数x 、c
		List<Pair> query = new ArrayList<>(); //保存询问的俩个区间端点l、r
		
		for(int i = 0;i < n;i ++) {
			int x = sin.nextInt();
			int c = sin.nextInt();
			addList.add(new Pair(x, c));
			//将x存入待离散化集合
			alls.add(x);
		}
		
		for(int i = 0;i < m;i ++) {
			int l = sin.nextInt();
			int r = sin.nextInt();
			query.add(new Pair(l, r));
			
			alls.add(l);
			alls.add(r);
		}
		//那么，进行至此，alls中存好了所有会被用到的值，可以进行离散化操作
		
		//1.排序
		Collections.sort(alls);
		//2.去重
		alls.subList(0, unique(alls));

	}

}
