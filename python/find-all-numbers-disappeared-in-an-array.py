"""
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.

Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= nums[i] <= n
"""

from typing import List


def findDisappearedNumbers(nums: List[int]) -> List[int]:
    result_list: List[int] = []
    index: int = -1

    for i in range(len(nums)):
        if nums[i] < 0:
            index = nums[i] * (-1) - 1
        else:
            index = nums[i] - 1

        if nums[index] > 0:
            nums[index] *= -1

    for i in range(len(nums)):
        if nums[i] > 0:
            result_list.append(i + 1)

    return result_list
