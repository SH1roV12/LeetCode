class Solution:
    def makeGood(self, s: str) -> str:
        someStack = collections.deque()
        for symbol in s:
            if len(someStack)!=0:
            
                if symbol != someStack[-1] and symbol.capitalize() == str(someStack[-1]).capitalize():
                
                    someStack.pop()
                    continue
            someStack.append(symbol)
        answ = ""
        for s in someStack:
            answ += s
        return answ