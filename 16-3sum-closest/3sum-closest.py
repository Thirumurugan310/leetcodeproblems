class Solution:
    def threeSumClosest(self, nums: List[int], t: int) -> int:
        n = 0
        ll = 0
        nums.sort()
        m = float('inf')
        for i in range(len(nums)):
            l = i+1
            r = len(nums) - 1
            while l < r :
                s = nums[i] + nums[l] + nums[r]
                k = abs(s - t)
                if m > k:
                    m = k
                    ll = s
                if s < t:
                    l += 1
                else:
                    r -= 1
        return ll