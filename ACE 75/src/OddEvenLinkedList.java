public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        var current = head;
        int size = 1;
        while(current.next != null) {
            size++;
            current = current.next;
        }

        var first = head;
        var second = current;
        for(int i = 0; i < size / 2 ; i++) {
            for (int j = 0; j <= i; j++)
                second = second.next;

            temp1 = first.next;
            temp2 = second.next;
            first.next = temp2;
            second.next = temp2.next;
            temp2.next = temp1;

            first = first.next;
            second = first;
        }

        return head;
    }
}
