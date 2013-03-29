class Node{

int data;
Node next;
Node extra;

public Node(int data, Node next)
{
	this.data=data;
	this.next=next;
}

public Node(int data)
{
	this.data=data;
 }

}


public class LinkList{

private Node head;

public void addFirst(int data)
{
	head = new Node(data,head);

}
public void display()
{
for(Node tmp=head;tmp!=null;tmp=tmp.next)
{
	System.out.print(" "+tmp.data);
}
}
 
public void reverse(Node node)
{
	if(node.next!=null)
	{
	reverse(node.next);
	}
	System.out.print(node.data+ " ");
	
	
	
}
		// here i adding list in reverse manner
		// can also be  done in forwared way , call display(), its forward traversal..
 
    public Node addTwoNumbers( Node l1,  Node l2) 
	{
        int carry = 0;
        Node l3 = null;
        Node iter = null;
		
        while(l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.data;
            int v2 = l2 == null ? 0 : l2.data;
			
            int sum = (v1 + v2 + carry) % 10;
            carry = (v1 + v2 + carry) / 10;
             
            Node node = new Node(sum,null);
			
            if(l3 == null) 
			{
                iter = node;
                l3 = node;
            } else 
			
			 // after this step node and iter are same
			{
                iter.next = node;
                iter = node;
            }
             
            // also can be done like this, as these are my lists, so obvious necessary..
            l1 =   l1.next;
            l2 =   l2.next;
        }
		
		
        if(carry != 0) {
            Node node = new Node(carry);
            node.next = null;
            iter.next = node;
            iter = node;
        }
        return l3;
    }


public static void main(String args[])
{
LinkList list1= new LinkList();

int a1[] = {2,4,3};
for(int i=0;i<a1.length;i++)
{
	list1.addFirst(a1[i]);
}

System.out.println("link list traversal :");
list1.reverse(list1.head);
System.out.println();
 
LinkList list2= new LinkList();

int a2[] = {9,6,4};
for(int i=0;i<a2.length;i++)
{
	list2.addFirst(a2[i]);
}

System.out.println("link list traversal :");
list2.reverse(list2.head);
System.out.println();

LinkList sol= new LinkList();

sol.head = sol.addTwoNumbers( list1.head,list2.head) ;



System.out.println("Sum of two link lists  :");
sol.reverse(sol.head);
System.out.println(); 
}


}
