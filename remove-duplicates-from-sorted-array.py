from typing import List


def removeDuplicates(nums: List[int]) -> int:
    if not nums:
        return 0

    write_index: int = 1

    for read_index in range(1, len(nums)):
        if nums[read_index] != nums[read_index - 1]:
            nums[write_index] = nums[read_index]
            write_index += 1

    return write_index
