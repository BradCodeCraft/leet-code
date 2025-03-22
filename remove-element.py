from typing import List


def removeElement(nums: List[int], val: int) -> int:
    while val in nums:
        nums.remove(val)

    return len(nums)
