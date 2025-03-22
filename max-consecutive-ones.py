from typing import List


def findMaxConsecutiveOnes(nums: List[int]) -> int:
    if not nums:
        return 0
    elif nums == [0]:
        return 0
    elif nums == [1]:
        return 1
    elif set(nums) == {0}:
        return 0
    elif set(nums) == {1}:
        return len(nums)
    else:
        current_total: int = 0
        current_max: int = 0

        for num in nums:
            if num == 1:
                current_max += 1
            else:
                current_total = max(current_total, current_max)
                current_max = 0

        return max(current_total, current_max)


findMaxConsecutiveOnes([1, 1, 0, 1, 1, 1])
