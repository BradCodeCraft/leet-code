from typing import List


def sortArrayByParity(nums: List[int]) -> List[int]:
    left: int = 1 if nums[0] % 2 == 0 else 0

    for right in range(left, len(nums)):
        if nums[right] % 2 == 0:
            left_number: int = nums[left]
            nums[left] = nums[right]
            nums[right] = left_number
            left += 1

    return nums
