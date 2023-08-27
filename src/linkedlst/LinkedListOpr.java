package linkedlst;

class LinkedList{
    int data;
    LinkedList next;

    public LinkedList(int data){this.data= data;};

    public LinkedList(int data,LinkedList next){
        this.data = data;
        this.next = next;
    }
}
public class LinkedListOpr {
    public static void main(String[] args) {

        LinkedList head = new LinkedList(1);
        head.next  = new LinkedList(3);
        head.next.next = new LinkedList(4);
        head.next.next.next = new LinkedList(5);

        System.out.println("middle element "+middleNode(head).data);
        System.out.println("nth node "+NthNode(head,4).data);
        System.out.println("Nth from last "+NthNodeFromLast(head,2).data);
        LinkedList reverse = reverseList(head);
        printList(reverse);


    }

    public static LinkedList NthNode(LinkedList head,int n){
        for(int i=1;i<n;i++)
            head = head.next;
        return head;
    }

    public static LinkedList NthNodeFromLast(LinkedList head,int n){
        LinkedList fast = head;
        LinkedList slow = head;
        for(int i=1;i<n;i++)
            fast = fast.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static LinkedList reverseList(LinkedList head){

        LinkedList prev = null;
        LinkedList temp ;
        LinkedList start = head;

        while(start != null){
            temp = start.next;
            start.next = prev;
            prev = start;
            start = temp;
        }


        return prev;
    }


    public static LinkedList middleNode(LinkedList head) {
        LinkedList fast = head;
        LinkedList slow = head;

        if(fast == null || fast.next == null)
            return fast;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public static void printList(LinkedList head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}


