// 27. Remove Element
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int t = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                while (nums[t] == val) {
                    t--;
                    k++;
                    if ( t < 0 ) {
                        break;
                    }
                }
                if (t <= i) {
                    break;
                }
                nums[i] = nums[t];
                t--;
                k++;
            }

        }
        return nums.length - k;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(nums.length);
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
