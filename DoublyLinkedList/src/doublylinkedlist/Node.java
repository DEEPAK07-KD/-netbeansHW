 
package doublylinkedlist;

public class Node {
    int data;
    Node pre;
    Node next;
    
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.pre=null;
    }
}
