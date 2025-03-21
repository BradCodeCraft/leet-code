from typing import List


def twoSum(nums: List[int], target: int) -> List[int]:
    if len(nums) == 2:
        return [0, 1]
    else:
        for l in range(len(nums) - 1):
            for r in range(l + 1, len(nums)):
                if nums[l] + nums[r] == target:
                    return [l, r]
        return []
