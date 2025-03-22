from typing import List


def runningSum(nums: List[int]) -> List[int]:
    result: List[int] = []
    current_sum: int = 0

    for num in nums:
        current_sum += num
        result.append(current_sum)

    return result


print(runningSum([1, 2, 3, 4]))
