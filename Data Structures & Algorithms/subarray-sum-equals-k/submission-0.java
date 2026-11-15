class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> arr= new HashMap<>();
        int sum=0,count=0;
        arr.put(0,1);
        for(int i:nums){
            sum+=i;
            if(arr.containsKey(sum-k)){
                count+=arr.get(sum-k);
            }
            arr.put(sum,arr.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}