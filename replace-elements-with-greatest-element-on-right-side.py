from typing import List

"""
Given an array arr, replace every element in that array with the greatest element among the
elements to its right, and replace the last element with -1.

After doing so, return the array
"""


def replaceElements(arr: List[int]) -> List[int]:
    right_pointer: int = len(arr) - 1
    current_max: int = -1

    while right_pointer >= 0:
        if arr[right_pointer] > current_max:
            temporary_max = arr[right_pointer]
            arr[right_pointer] = current_max
            current_max = temporary_max
        else:
            arr[right_pointer] = current_max

        right_pointer -= 1

    return arr
