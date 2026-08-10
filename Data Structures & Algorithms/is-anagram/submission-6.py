class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
            
        # Step 2: Convert to lists and sort them
        l1 = list(s)
        l2 = list(t)
        
        l1.sort()
        l2.sort()
        
        # Step 3: Directly compare the sorted lists
        return l1 == l2