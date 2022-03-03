# 2. Reversing Linked List

There is a singly linked list of n integers where n is even. Each node instance, a `SinglyLinkedListNode`, has a value, data, and a pointer to the next node, next. Perform the following operations on the linked list.

1. Select the segment of all n nodes and then reverse it.
2. Reduce the segment size by 1 from each end and then reverse it.
3. Repeat from step 2 until the segment size reaches zero.

Return a reference to the head of the final linked list.

**Note:** You are not allowed to use extra memory other than creating some new nodes required for the implementation.

### Example

- The Initial linked list is:
  `1->5->2->7->8->3`

- The entire list of n = 6 is reversed.
  `3->8->7->2->5->1`

- Move the left and right pointers in one position to define a segment with 4 nodes, then reverse those nodes.
  `3->5->2->7->8->1`

- Again move the pointers towards the center by one node each. Now there are 2 nodes to reverse.
  `3->5->7->2->8->1`

After moving the pointers this time, the segment has 0 nodes and the iterations stop. Return a reference to the head of the final linked list, `3->5->7->2->8->1`.

**Function Description**
Complete the function reversingLinkedList in the editor below.

The function has the following parameter(s):

```
head: reference to the head of a linked list of length n
```

Returns:
`a reference to the head of the final linked list.`

**Constraints**

- 1 ≤ n ≤ 10<sup>5
- 1 ≤ data ≤ 10<sup>9
- The length of the linked list is always even.

**Sample Input**

- 3 -> 4 -> 7 -> 8

**Sample Output**

```
8
4
7
3
```

**Explanation**

- Reversing the segment from position (1, 4), the list is `8->7->4->3`
- Reversing the segment from position (2, 3), the list is `8->4->7->3`

**Sample Test Case 1**

- 2 -> 9

**Sample Output**

```
9
2
```

**Explanation**

- Reversing the segment from position (1, 2), the list is `9->2`

```Java
class Result {
    public static SinglyLinkedList reversingLinkedList(SinglyLinkedList head) {
        if (head == null || head.next == null) {
            return head;
        }

        SinglyLinkedList curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        for (int i = 0; i < count / 2; i++) {
            if (i % 2 == 0) {
                swapNodes(head, i, count);
            }
        }
        return head;
    }

    public static void swapNodes(SinglyLinkedList head, int k, int size) {
        SinglyLinkedList first = head;
        SinglyLinkedList last = head;

        if (size < k) {
            return;
        }

        for (int i = 0; i < k; i++) {
            first = first.next;
        }

        for (int i = 0; i < size - k - 1; i++) {
            last = last.next;
        }

        int temp = first.val;
        first.val = last.val;
        last.val = temp;
    }
}
```
