public class duplicate {
    public static void main(String[] args) {
        int nums []={1,2,3,4,5,6,3,8};
        int n  = nums.length;
         

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++)
             {
                if (nums[i] == nums[j]) {
                   System.out.println(nums[i]);
                }
            
        }
    }
}
}
