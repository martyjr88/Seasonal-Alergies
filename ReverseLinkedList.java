public class ReverseLinkedList {
    public static void main(String[] args) {
       
        ListNode head = new ListNode("hello", null);
         head = new ListNode("foo", head);
         head = new ListNode("boo", head);
         head = new ListNode("nonsense", head);
         head = new ListNode("computer",
            	new ListNode("science",
            		new ListNode("java",
            			new ListNode("coffee", head)
            		)
            	)
            );

        //Reverse this bitch ^



    }

    public void reverseList(ListNode head) {
        ListNode n = null;
        ListNode c = head;
        ListNode p = null;

        while(head != null) {
            n = c.getNext();
            c.setNext(p);
            p = c;
            c = c.getNext();
        }

    }

}
