// 80. Remove Duplicates from Sorted Array II
public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int i = 0;
        int j = 1;
        boolean second = true;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                if (second) {
                    k++;
                    nums[++i] = nums[j];
                    second = false;
                }
                j++;
                continue;
            }
            k++;
            nums[++i] = nums[j++];
            second = true;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }
}
