from typing import List


def sortedSquares(nums: List[int]) -> List[int]:
    result_array: List[int] = []

    for num in nums:
        result_array.append(num * num)

    return sorted(result_array)
