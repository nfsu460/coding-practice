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

        SinglyLinkedList head = new SinglyLinkedList(1);
        head.next = new SinglyLinkedList(5);
        head.next.next = new SinglyLinkedList(2);
        head.next.next.next = new SinglyLinkedList(7);
        head.next.next.next.next = new SinglyLinkedList(8);
        head.next.next.next.next.next = new SinglyLinkedList(3);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        head = new SinglyLinkedList(Integer.parseInt(br.readLine()));
        SinglyLinkedList curr = head;

        for (int i = 1; i < n; i++) {
            curr.next = new SinglyLinkedList(Integer.parseInt(br.readLine()), null);
            curr = curr.next;
        }

        SinglyLinkedList result = reversingLinkedList(head);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}

class Result {
    public static SinglyLinkedList reversingLinkedList(SinglyLinkedList head) {
        // Write your code here
        SinglyLinkedList result = head;
        return result;
    }
}