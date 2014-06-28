package LinkedList;

public class Sample {
	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.push(4);
		l.push(5);
		l.push(2);
		l.push(6);
		l.push(9);
		l.push(0);
		l.push(3);
		l.push(7);
		l.deleteNodeWithValue(7);
		l.printLinkedList();
		l.deleteNode(l.getElementAt(6));
		
		System.out.println();
		l.printLinkedList();
	}

}
