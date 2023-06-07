package service;

public interface Estadistica {
	int media(int[] nums);
	default int sumatorio(int[] nums) {
		return nums[0]+nums[nums.length-1];
	}
}
