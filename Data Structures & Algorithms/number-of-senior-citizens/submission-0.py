class Solution:
    def countSeniors(self, details: List[str]) -> int:
        a=[]
        for i in details:
            a.append(i[11:13])
        c=0
        for i in a:
            if i>"60":
                c+=1
        return c

