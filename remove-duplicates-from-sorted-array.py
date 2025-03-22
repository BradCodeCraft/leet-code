from typing import List


def removeDuplicates(nums: List[int]) -> int:
    unique_nums: List[int] = sorted(set(nums))
    nums[: len(unique_nums)] = unique_nums
    return len(unique_nums)
