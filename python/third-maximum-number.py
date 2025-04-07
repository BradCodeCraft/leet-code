"""
Given an integer array nums, return the third distinct maximum number in
this array. If the third maximum does not exist, return the maximum number.

Constraints:
    - 1 <= nums.length <= 104
    - 231 <= nums[i] <= 231 - 1
"""

from typing import List


def thirdMax(nums: List[int]) -> int:
    unique_nums = set(nums)
    unique_nums = sorted(unique_nums)

    if len(unique_nums) >= 3:
        return unique_nums[-3]
    else:
        return unique_nums[-1]
