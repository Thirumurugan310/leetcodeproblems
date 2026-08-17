class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        a = []
        s = set()
        for i in range(len(nums) - 2):
            l = i + 1
            r = len(nums) - 1
            while l < r:
                total = nums[i] + nums[l] + nums[r]
                if total == 0:
                    arr = [nums[i], nums[l], nums[r]]
                    if tuple(arr) not in s:
                        a.append(arr)
                        s.add(tuple(arr))
                    l += 1
                    r -= 1
                elif total < 0:
                    l += 1
                else:
                    r -= 1
        return a