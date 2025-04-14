class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode ptrA = headA, ptrB = headB;

        while (ptrA != null) {
            lenA++;
            ptrA = ptrA.next;
        }
        while (ptrB != null) {
            lenB++;
            ptrB = ptrB.next;
        }

        ptrA = headA;
        ptrB = headB;

        for (int i = 0; i < Math.abs(lenA - lenB); i++) {
            if (lenA > lenB) {
                ptrA = ptrA.next;
            } else {
                ptrB = ptrB.next;
            }
        }

        while (ptrA != null && ptrB != null) {
            if (ptrA == ptrB) {
                return ptrA;
            }
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at: " + intersection.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
