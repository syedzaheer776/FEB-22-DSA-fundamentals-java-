
public class linkedList {
	Node head;
	Node current;
	

	public static class Node{
		int data;
		Node next;

		Node(int d){
			
				data =d; next=null;
			
		}
	}
	

	public void insertAtFirst(int d){
		if(head ==null)
		{
			head = new Node(d);
			
		}
		else{
			Node n = new Node(d);
			n.next =head;
			head =n;
		}
		
	}

	public void insertAfter(int n1,int d){
		Node temp =head;
		while(temp!=null){
			if(temp.data==n1){
				Node n =new Node(d);				
				n.next =temp.next;
				temp.next =n;
				break;

			}else{
				temp=temp.next;
			}
		}
	}

	public void insert(int d){
		
		if(head==null)
		{
			System.out.println("out");
			head =new Node(d);
			current =head;
			
		}else{
			
			System.out.println("in ");
			Node n = new Node(d);
			current.next=n;
			current=current.next;

			
		}

	}

	public void delete(int d){

		Node currentNode=head;
		Node previousNode=null;
		if(head.data ==d){
			head = head.next;
		}else{
			while(currentNode!=null){
				if(currentNode.data==d){
					previousNode.next=currentNode.next;
					break;
				}else{
				previousNode=currentNode;
				currentNode =currentNode.next;
			}
			}
		}

	}
	 public void show(){
	 	System.out.println("---Showing---");
	 	Node myNode =head;
	 	while(myNode!=null){
	 		System.out.println(myNode.data);
	 		myNode =myNode.next;
	 	}
	 }	


	 

	 public void deleteAtPosition(int d){

	 	Node temp =head;
	 	Node prev =null;
	 	int count=1;
		if(d==1){
	 			head =head.next;

	 		}else{
	 	while(temp!=null)
	 	{
	 		if(count==d){
	 			prev.next=temp.next;

	 			break;
	 		}else{
	 			prev =temp;
	 			temp =temp.next;
	 			count++;

	 		}
	  	}
	 }
	 }

public static void main(String[] args) {
	linkedList list = new linkedList();
	list.insert(1);
	list.insert(2);
	list.insert(4);
	list.insert(3);
	list.insert(5);

	list.show();

	list.delete(2);
	list.delete(4);
	list.show();

	list.insertAtFirst(9);
	list.show();

	list.insertAfter(3,4);
	list.show();
	list.insertAfter(5,6);
	list.show();
	list.deleteAtPosition(3);
	list.show();
	list.deleteAtPosition(1);
	list.show();


}
}

