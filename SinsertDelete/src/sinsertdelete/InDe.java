package sinsertdelete;
public class InDe {
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
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    void delete(int data)
    {
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
            return;
        }
        if(head.data == data)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next != null && temp.next.data  != data)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("VALUE IS NOT FOUND");
            return;
        }
        temp.next=temp.next.next;
    }
    void display()
    {
        Node temp=head;
        while(temp != null)
        {
            System.out.print(temp.data+" "+"-->"+" ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
}
