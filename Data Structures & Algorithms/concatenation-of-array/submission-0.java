class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int ans[]=new int[2*l];
        int j=0;
        for(int i=0;i<nums.length;i++){
            ans[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            ans[j]=nums[i];
            j++;
        }
        return ans;
    }
}