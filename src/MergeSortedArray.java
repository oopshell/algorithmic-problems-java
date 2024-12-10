// 88. Merge Sorted Array
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 1;
        int p2 = 1;
        int t = 1;
        while (p1 <= m && p2 <= n) {
            if (nums1[m-p1] < nums2[n-p2]) {
                nums1[m+n-t] = nums2[n-p2];
                p2++;
            } else {
                nums1[m+n-t] = nums1[m-p1];
                p1++;
            }
            t++;
        }
        if (p1 > m) {
            while (p2 <= n) {
                nums1[m+n-t] = nums2[n-p2];
                p2++;
                t++;
            }
        } else {
            while (p1 <= m) {
                nums1[m+n-t] = nums1[m-p1];
                p1++;
                t++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        for (int j : nums1) {
            System.out.print(j + " ");
        }
    }
}
