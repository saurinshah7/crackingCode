package arrays;

import java.util.*;

public class ReplaceSpace {

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=in.next();
		char []ch=str.toCharArray();
		replaceSpace(ch);
		System.out.println(new String(ch));
		
		
		in.close();
	}
	
	public static void replaceSpace(char []ch){
		int count=0;
		int len=ch.length;
		for(int i=0;i<len;i++){
			if(ch[i]==' ') count++;
		}
		
		int newLength=len+count*2;
		ch[newLength]='\0';
		
		for(int i=len-1;i>=0;i--){
			if(ch[i]==' '){
				ch[newLength-1]='0';
				ch[newLength-2]='2';
				ch[newLength-3]='%';
				newLength=newLength-3;
			}
			else
			{
				ch[newLength-1]=ch[i];
				newLength--;
			}
			
		}
	}
	
	
}
