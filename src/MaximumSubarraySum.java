public class MaximumSubarraySum {
    // Brute Force approach - O(n^3)
    public static int maxSubarrayBruteForce(int[] nums) {
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }

    // Divide and Conquer approach - O(nlogn)
    public static int maxSubarrayDivideAndConquer;

    // Kadane's Algorithm (Dynamic Programming) - O(n)
    public static int maxSubarrayKadane;

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + maxSubarrayBruteForce(arr));
    }
}
