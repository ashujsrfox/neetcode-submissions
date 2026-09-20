class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        l=[]
        for i in nums:
            if i not in l:
                l.append(i)
        
        for i in range(len(nums)+1):
            if i not in l:
                return i;
        return 0;