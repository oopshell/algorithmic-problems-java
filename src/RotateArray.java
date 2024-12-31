// 189. Rotate Array

import java.util.Arrays;

public class RotateArray {
    public static void rotate1(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int start = nums[0];
        int buffer = start;
        while (buffer != start || i == 0) {
            int position = (i + k) % n;
            int tmp = nums[position];
            nums[position] = buffer;
            buffer = tmp;
            i = position;
        }
    }
    // Cyclic replacements, Space complexity: O(1)

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate1(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
