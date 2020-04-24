package cn.acwing;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ʹ����ɢ��������⣺
 * 1.��������
 * 2.����ȥ��
 * 3.�������x��Ӧ����ɢ����ֵ
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

public class ����� {
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
		int n = sin.nextInt(); //n �β���
		int m = sin.nextInt(); //m ��ѯ��
		
		int N = 300010; //��Ҫ��ÿ�β�������x �� ÿ��ѯ�ʵ���������˵�l��r�������� ��ÿһ��100000
		int[] arr = new int[N]; //ԭ����
		int[] s = new int[N]; //ǰ׺������
		
		List<Integer> alls = new ArrayList<>();  //����������Ҫ��ɢ����ֵ����ÿ�β�������x �� ÿ��ѯ�ʵ���������˵�l��r
		
		List<Pair> addList = new ArrayList<>(); //��������������x ��c
		List<Pair> query = new ArrayList<>(); //����ѯ�ʵ���������˵�l��r
		
		for(int i = 0;i < n;i ++) {
			int x = sin.nextInt();
			int c = sin.nextInt();
			addList.add(new Pair(x, c));
			//��x�������ɢ������
			alls.add(x);
		}
		
		for(int i = 0;i < m;i ++) {
			int l = sin.nextInt();
			int r = sin.nextInt();
			query.add(new Pair(l, r));
			
			alls.add(l);
			alls.add(r);
		}
		//��ô���������ˣ�alls�д�������лᱻ�õ���ֵ�����Խ�����ɢ������
		
		//1.����
		Collections.sort(alls);
		//2.ȥ��
		alls.subList(0, unique(alls));

	}

}
