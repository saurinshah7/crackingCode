package LinkedList;

import java.util.*;

public class RemoveDuplicate {

	public static void main (String []args){
		LinkedList l=new LinkedList();
		for(int i=0;i<20;i++){
			l.push(new Random().nextInt(10));
		}
		
		l.printLinkedList();
		
		removeWithMemory(l);
	}
	
	public static void removeWithMemory(LinkedList l){
		for(int i=0;l.getElementAt(i)!=null;i++){
			
		}
		
	}
	
}
