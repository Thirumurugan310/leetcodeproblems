class Solution:
    def fourSum(self, n: List[int], t: int) -> List[List[int]]:
        ll = []
        n.sort()
        for i in range(len(n)):
            if i > 0 and n[i] == n[i - 1]:
                continue
            for j in range(i + 1, len(n) - 2):
                if j > i+1 and n[j] == n[j - 1]:
                    continue
                l = j + 1
                r = len(n) - 1
                while l < r:
                    s = n[i] + n[j] + n[l] + n[r]
                    if s==t :  
                        ll.append([n[i] , n[j] , n[l] , n[r]])
                        l+=1
                        r-=1

                        while l < r and n[l] == n[l - 1]:
                            l += 1
                        while l < r and n[r] == n[r + 1]:
                            r -= 1
                    elif s < t:
                        l+=1
                    else :
                        r-=1
        return ll
