class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LL {

    // Converting array to LinkedList 
    public static Node convertArrayToLL(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Traversing LinkedList 
    public static void traverse(Node head){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data);
            if(temp.next!=null) System.out.print(" -> ");
            temp = temp.next;
        }
    }

    public static Node insertFirst(Node head,int n){
        if(head==null) {
            Node temp = new Node(n);
            head = temp;
            return head;
        }
        return head;
    }


    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};

        Node head = convertArrayToLL(arr);

        traverse(head);

    }
}
