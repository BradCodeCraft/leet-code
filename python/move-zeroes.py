from typing import List


def moveZeroes(nums: List[int]) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    if len(nums) == 1:
        return

    left: int = 0 if nums[0] == 0 else 1
    length: int = len(nums)
    for right in range(1, length):
        if nums[right] != 0:
            nums[left] = nums[right]
            left += 1

    while left < length:
        nums[left] = 0
        left += 1
