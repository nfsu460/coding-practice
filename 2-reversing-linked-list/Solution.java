import java.util.*;
import java.io.*;

class SinglyLinkedList {
    int val;
    SinglyLinkedList next;

    SinglyLinkedList() {
    }

    SinglyLinkedList(int val) {
        this.val = val;
    }

    SinglyLinkedList(int val, SinglyLinkedList next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // 0 1 2 3 4 5
        // 1 5 2 7 8 3
        // 3 5 7 2 8 1
        SinglyLinkedList head = new SinglyLinkedList(3);
        head.next = new SinglyLinkedList(4);
        head.next.next = new SinglyLinkedList(7);
        head.next.next.next = new SinglyLinkedList(8);

        /*
         * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         * int n = Integer.parseInt(br.readLine());
         * 
         * head = new SinglyLinkedList(Integer.parseInt(br.readLine()));
         * SinglyLinkedList curr = head;
         * 
         * for (int i = 1; i < n; i++) {
         * curr.next = new SinglyLinkedList(Integer.parseInt(br.readLine()), null);
         * curr = curr.next;
         * }
         */

        SinglyLinkedList result = Result.reversingLinkedList(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

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