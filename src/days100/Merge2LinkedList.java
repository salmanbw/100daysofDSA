package days100;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Merge2LinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(4);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        ListNode node3 = mergeTwoLists(node1,node2);
        printList(node3);

    }

    public static void printList(ListNode node){

        while(node  != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode list = new ListNode(0);
        ListNode start = list;

        if(list1 == null && list2 == null)
            return list;

        if(list1 == null)
            return list2;

        if(list2 == null)
            return list1;


        while(list1  != null && list2 != null){
            if(list1.val >= list2.val){
                list.next = list2;
                list2 = list2.next;
            }else {
                list.next = list1;
                list1 = list1.next;
            }
            list = list.next;
        }

        if(list1 != null)
            list.next = list1;


        if(list2 != null)
            list.next = list2;

        return start.next;
    }
}

