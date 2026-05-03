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
public class Test{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        Node x = new Node(arr[2],null);
        Node y = new Node(arr[1],x);

        System.out.println(x.next);
    }
}