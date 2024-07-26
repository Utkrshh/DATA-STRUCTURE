class window {
    static long maximumSubarraySum(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int maxi = -1;
        int sum = 0;

        while (j < nums.length) {
            sum = sum + nums[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                maxi = Math.max(maxi, sum);
            }

            sum = sum - nums[i];
            i++;
            j++;
        }
        return maxi;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 5, 6, 7, 8};
        int k = 3;
        long result = maximumSubarraySum(nums, k);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
