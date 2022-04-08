class SinglyLinkedList {
    int data;
    SinglyLinkedList next;

    public SinglyLinkedList(int data) {
        this.data = data;
        this.next = null;
    }
}

class Result {
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