class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1, zero = 0;
        for (int i : nums) {
            if (i == 0) {
                zero++;
                continue;
            } else {
                p *= i;
            }
        }
        if (zero >= 2) {
            for (int i = 0; i < nums.length; i++)
                nums[i] = 0;
        } else if (zero == 0) {
            for (int i = 0; i < nums.length; i++)
                nums[i] = p / nums[i];
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    nums[i] = p / (nums[i] + 1);
                else
                    nums[i] = 0;

            }
        }
        return nums;

    }
}
