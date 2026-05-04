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

public class ConvertArrayToLL {
    public static boolean search(Node head,int elem){
        Node temp = head;
        while(temp!=null){
            if(temp.data==elem) return true;
            temp = temp.next;
        }
        return false;
    }
    public static Node deleteHead(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,5,4,9};
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        // Traversing the linked list
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            if(temp.next== null) System.out.print("null");
            temp = temp.next;
        }

        // Length of the linked list
        // int len = 0;
        // Node temp2 = head;
        // while(temp2!=null){
        //     len++;
        //     temp2 = temp2.next;
        // }
    }
    
}
