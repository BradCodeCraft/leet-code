from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
    fast: Optional[ListNode] = head
    slow: Optional[ListNode] = head

    while fast and slow and fast.next:
        slow = slow.next
        fast = fast.next.next

    return slow
