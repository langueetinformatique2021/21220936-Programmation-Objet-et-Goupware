package FENG_YIJUN_TD4;

import java.util.Arrays;

public class Condition4 {

	public static void main(String[] args) {
		int p1=10, p2=9, p3=-1, p4=4, p5=8;
		int[] nums = {p1, p2, p3, p4, p5};
		Arrays.sort(nums);
		int p6 = nums[nums.length/2];
		System.out.println (p6);

	}

}
