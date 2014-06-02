package arrays;

import java.util.*;

public class UniqueString {
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=in.next();
		
		if(isUnique(str)){
			System.out.println("is Unique");
		}
		else
			System.out.println("isnt Unique");
		
		in.close();
		
	}
	
	public static boolean isUnique(String str){
		int l=str.length();
		boolean[] bl=new boolean[256];
		for(int i=0;i<l;i++){
			int val=str.charAt(i);
			if(bl[val]) return false;
			bl[val]=true;
		}
	
	return true;
	}

}
