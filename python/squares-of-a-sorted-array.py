from typing import List


def sortedSquares(nums: List[int]) -> List[int]:
    length: int = len(nums)
    left_pointer: int = 0
    right_pointer: int = length - 1
    result_array: List[int] = [0] * length

    for i in range(length - 1, -1, -1):
        if abs(nums[right_pointer]) > abs(nums[left_pointer]):
            result_array[i] = nums[right_pointer] * nums[right_pointer]
            right_pointer -= 1
        else:
            result_array[i] = nums[left_pointer] * nums[left_pointer]
            left_pointer += 1

    return result_array


print(sortedSquares([-4, -1, 0, 3, 10]))
print(sortedSquares([-7, -3, 2, 3, 11]))
print(sortedSquares([1, 4, 9, 25]))
