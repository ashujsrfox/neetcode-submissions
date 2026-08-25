class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        rep=nums[0]
        c=nums.count(rep)
        for i in nums:
            if nums.count(i)>c:
                rep=i
        return rep

        