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
    public static void main(String[] args) {
        int[] arr = {8,1,2,5,4,9};
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            if(temp.next== null) System.out.print("null");
            temp = temp.next;
        }
    }
}
