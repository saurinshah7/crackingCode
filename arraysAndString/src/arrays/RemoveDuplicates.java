package arrays;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=in.next();
		char []ch=str.toCharArray();
		removeDuplicates(ch);
		System.out.println(new String(ch));
		
		in.close();
		
	}
	
	public static void removeDuplicates(char[] ch){
		int tail=1;
		int len=ch.length;
		for(int i=1;i<len;i++){
			int j;
			for(j=0;j<tail;j++){
				if(ch[j]==ch[i]) break;
			}
			
			if(j==tail){
			ch[tail]=ch[i];
			tail++;}
		}
		
		for(;tail<len;tail++){
			ch[tail]=0;
		}
		
	}

}
