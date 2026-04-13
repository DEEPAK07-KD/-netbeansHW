package circulardoubly;
public class Main {
    Node head;
    void insertHead(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            head.next=head;
            head.pre=head;
        }
        else
        {
            Node last=head.pre;
            n.next=head;
            n.pre=last;
            last.next=n;
            head.pre=n;
            head=n;
        }
    }
     void insertTail(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            head.next=head;
            head.pre=head;
        }
        else
        {
            Node last=head.pre;
            last.next=n;
            n.pre=last;
            n.next=head;
            head.pre=n;
        }
    }

    void positionAt(int data,int pos)
    {
        Node n=new Node(data);
        if(pos==1)
        {
           
            insertHead(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        
        if(temp==head)
        {
            System.out.println("INVALID POSITION");
            return;
        }
        }
        Node ne=temp.next;
        temp.next=n;
        n.pre=temp;
        n.next=ne;
        ne.pre=n;
    }
    void display()
    {
        Node temp=head;
        do
        {
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("HEAD");
    }
}
