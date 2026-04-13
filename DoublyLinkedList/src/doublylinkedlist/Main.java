package doublylinkedlist;
public class Main {
    Node head;
    void insert(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
           
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
            n.pre=temp;
        }
    }
    void insertAtPosition(int data,int pos)
    {
        Node n=new Node(data);
        if(pos==1)
        {
            if(head!=null)
            {
            head.pre=n;
            }
            head=n;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp != null;i++)
        {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("INVALID POSITION");
            return;
        }
        n.next=temp.next;
        n.pre=temp;
        if(temp.next!=null)
        {
            temp.next.pre=n;
        }
        temp.next=n;
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("DOUBLY");
    }
}
