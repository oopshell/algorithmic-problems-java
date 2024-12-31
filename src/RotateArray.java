// 189. Rotate Array

import java.util.Arrays;

public class RotateArray {
    public static void rotate1(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; count < n; i++) {
            int j = i;
            int buffer = nums[j];
            do {
                int position = (j + k) % n;
                int tmp = nums[position];
                nums[position] = buffer;
                buffer = tmp;
                j = position;
                count++;
            } while (j != i);
        }
    }
    // Cyclic replacements, Space complexity: O(1)

    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    // Reverse, Space complexity: O(1)

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,4,5,6,7};
        int[] nums2 = {-1,-100,3,99};
//        rotate1(nums1, 3);
        rotate1(nums2, 2);
//        rotate2(nums1, 3);
//        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
