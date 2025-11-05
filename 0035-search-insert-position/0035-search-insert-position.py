class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        a=0
        for i in range(len(nums)):
            if nums[i]>=target:
                return a
                break
            elif nums[-1]<target:
                return len(nums)
            else:
                a+=1
            