class Solution:
    def decrypt(self, code: list[int], k: int) -> list[int]:
        if k == 0:
            return [0] * len(code)
        curSum = 0
        result = [0] * len(code)
        l = 1
        r = k
        if k < 0:
                l = len(code) - (k * -1)
                r = len(code) - 1
        tmpL = l
        while tmpL <= r:
                curSum += code[tmpL]
                tmpL+=1
        
        for i in range(len(code)):
                result[i] = curSum
                curSum -= code[l]
                l = (l+1)%len(code)
                r = (r+1)%len(code)
                curSum += code[r]
        return result