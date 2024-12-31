// 169. Majority Element
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    // use built-in sort
    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    // Time complexity: O(nlogn)
    // Space complexity: O(logn)
    // java.util.Arrays.sort uses a Dual-Pivot Quicksort algorithm for primitive types (such as int, char, etc.)
    // and a modified Timsort algorithm for objects.

    // use HashMap
    public static int majorityElement2(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return 0;  // If no majority element is found in the hash map, the code returns 0 as the default value
    }

    // use Boyer-Moore Voting Algorithm
    public static int majorityElement3(int[] nums) {
        int count = 0;
        Integer candidate = null;  // Integer is used instead of int to take advantage of the null value, especially when the array contains all possible int values
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else {
                if (candidate == num) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement1(nums)); // 3
    }
}
