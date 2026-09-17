class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        s=""
        for i in nums:
            s=s+str(i)
        a=s.split('0')
        maxa=0
        for i in a:
            if len(i)>maxa:
                maxa=len(i)
        return maxa
