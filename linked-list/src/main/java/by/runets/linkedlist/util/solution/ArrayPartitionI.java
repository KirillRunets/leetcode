package by.runets.linkedlist.util.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayPartitionI {
	public int arrayPairSum(int[] nums) {
		int n = nums.length / 2;
		List<Integer> integers = Arrays.stream(nums).boxed().collect(Collectors.toList());
		List<Integer> mins = new ArrayList<>(n);
		Collections.sort(integers);
		for (int i = 0; i < integers.size() - 1; i++) {
			if (i % 2 == 0) {
				int min = Math.min(integers.get(i + 1), integers.get(i));
				mins.add(min);
			}
		}
		return mins
				.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}
	
	public static void main (String[] args) {
		int[] nums = {1,4,3,2};
		System.out.println(new ArrayPartitionI().arrayPairSum(nums));
	}
}
