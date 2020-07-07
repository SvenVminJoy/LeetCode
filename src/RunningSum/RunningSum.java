package RunningSum;
// test code review
public class RunningSum {
	public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
