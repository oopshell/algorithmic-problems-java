// 169. Majority Element
import java.util.Arrays;

public class MajorityElement {
    // use built-in sort
    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // use HashMap

    // use Boyer-Moore Voting Algorithm

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement1(nums)); // 3
    }
}
