class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        
        for i in range(len(arr) - 1):
            
            right_side_elements = arr[i + 1:]
            
            arr[i] = max(right_side_elements)
            
        # The last element must always be -1
        arr[-1] = -1
        return arr
