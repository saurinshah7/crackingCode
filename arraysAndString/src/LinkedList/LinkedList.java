package LinkedList;

public class LinkedList {

	Node first;
	public LinkedList(){
		first=null;
	}
	
	public void push(int n){
		Node a=new Node(n);
		
		
		if(first==null){
		first=a;	
		}
		else
		{
			Node end=first;
			while(end.next!=null){
				end=end.next;
			}
			
			end.next=a;
		}
		
	}
		
	public void printLinkedList(){
		if(first==null)
			System.out.println("LinkedList is empty");
		else
		{
			System.out.print(first.val);
			Node end=first.next;
			while(end!=null){
			System.out.print("->"+end.val);	
			end=end.next;
			};
		}
	}

	public boolean deleteNodeWithValue(int n){
	
	if(first==null)
		{System.out.println("LinkedList is empty");
		return false;
		}
	else
	{
		if(first.val==n){
			first=first.next;
			return true;
			
		}else if (first.next!=null)
		{
			Node curr=first.next;
			Node prev=first;
			do{
				if(curr.val==n){
					prev.next=curr.next;
					return true;
				}
				prev=curr;
				curr=curr.next;
				
			}while(curr!=null);
			
		}
	}
	return false;
		
	}

	public Node getElementAt(int n){
		
		
		Node end=first;
		while(n!=0){
			if(end==null){
			//	System.out.println("Out of bound");
				return null;
			}
			end=end.next;
			n=n-1;
		}
		
		return end;
	}
	
	
	public void deleteNode(Node n){
		if(first==n){
			first=first.next;
		}else
		{
			Node prev=first;
			Node curr=first.next;
			
			while(curr!=n){
				prev=curr;
				curr=curr.next;
			}
			
			prev.next=curr.next;
		}
		
	}

}
