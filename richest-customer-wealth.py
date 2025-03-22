from typing import List


def maximumWealth(accounts: List[List[int]]) -> int:
    current_max: int = 0

    for account in accounts:
        current_max = max(current_max, sum(account))

    return current_max
