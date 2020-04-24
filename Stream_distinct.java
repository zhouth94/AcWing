package cn.acwing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_distinct {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "C"));
		long count = lists.stream().distinct().count();
		System.out.println("dinsinct:" + count);
		String out = lists.stream().distinct().collect(Collectors.joining(","));
		System.out.println(out);
	}

}
