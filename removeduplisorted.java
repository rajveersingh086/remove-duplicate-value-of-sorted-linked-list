package geeks.linkedlist;
//Company Tags
//Microsoft OYO Rooms Oracle Visa Adobe Myntra.
class Node{
    int data ;
    Node next;
    Node (int x){
        data = x;
        next = null;
    }
}
class removeduplisorted{
    static Node remove(Node head){
        Node curr = head;

        while (curr != null && curr.next != null){
            if (curr.data == curr.next.data){
                Node nextNext = curr.next.next;
                curr.next = nextNext;

            }
            else{
                curr = curr.next;
            }
        }
        return head ;
    }
    static void printlist (Node node){
        while (node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(16);
        head.next.next.next = new Node(15);

        System.out.println("linked list before duplicate");
        printlist(head);

        head = remove(head);

        System.out.println("after duplicate");
        printlist(head);
    }
}