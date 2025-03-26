from typing import List

"""
Given an array of integers arr, return true if and only if it is a valid mountain array.
Recall that arr is a mountain array if and only if:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
        arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

"""


def validMountainArray(arr: List[int]) -> bool:
    if len(arr) < 3 or sorted(arr) == arr or sorted(arr)[::-1] == arr:
        return False

    peak_index: int = arr.index(max(arr))
    left_array: List[int] = arr[:peak_index]
    right_array: List[int] = arr[peak_index + 1 :]

    return (
        left_array == sorted(left_array)
        and right_array == sorted(right_array)[::-1]
        and len(left_array) == len(set(left_array))
        and len(right_array) == len(set(right_array))
    )
