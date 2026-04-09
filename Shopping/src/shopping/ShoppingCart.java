package shopping;
public class ShoppingCart {
    Product head;
    public void insert(int id,String name,double price)
    {
        Product newnode=new Product(id,name,price);
        if(head==null)
        {
            head=newnode;
            return;
        }
        else
        {
            Product temp=head;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void display()
    {
        Product temp=head;
        while(temp != null)
        {
            System.out.println("<--ALL ITMS-->");
            System.out.println("PRODUCT ID :"+" "+temp.id);
            System.out.println("PRODUCT NAME :"+" "+temp.name);
            System.out.println("PRODUCT PRICE :"+" "+temp.price);
            temp=temp.next;
        }
        //System.out.println("NULL");
    }
    
}
