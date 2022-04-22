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
class SinglyLinkedList {
    int data;
    SinglyLinkedList next;

    public SinglyLinkedList(int data) {
        this.data = data;
        this.next = null;
    }
}

class Result2 {
    public static SinglyLinkedList reversingLinkedList(SinglyLinkedList head) {
        SinglyLinkedList prev, slow, fast;
        prev = slow = fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        slow = reverse(slow);

        SinglyLinkedList head1, head2;
        head1 = head;
        head2 = slow;

        int n = 0;
        while (head1 != null) {
            if (n % 2 == 0) {
                int temp = head1.data;
                head1.data = head2.data;
                head2.data = temp;
            }
            head1 = head1.next;
            head2 = head2.next;
            n++;
        }

        slow = reverse(slow);
        prev.next = slow;

        return head;
    }

    private static SinglyLinkedList reverse(SinglyLinkedList head) {
        SinglyLinkedList prev = null;
        while (head != null) {
            SinglyLinkedList temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 8, 3};
        SinglyLinkedList head, tail;
        head = tail = new SinglyLinkedList(-1);
        for (int num : arr) {
            tail.next = new SinglyLinkedList(num);
            tail = tail.next;
        }
        head = head.next;

        display(reversingLinkedList(head));

    }

    private static void display(SinglyLinkedList node) {
        System.out.print("[ ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("]");
    }
}
```
