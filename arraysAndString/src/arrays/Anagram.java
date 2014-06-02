package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("String 1:");
		String s1=in.next();
		System.out.println("String 2:");
		String s2=in.next();
		
		if(areAnagram(s1,s2))
			System.out.println("Are anagram");
		else
			System.out.println("Not Anagram");
		
		in.close();
	}
	
	
	public static boolean areAnagram(String s1,String s2){
		
		if(s1.length()!=s2.length())
			return false;
		HashMap <Character, Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++){
			Character c=s1.charAt(i);
			if(map.containsKey(c)){
				Integer b=map.get(c);
				b++;
				map.put(c,b);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(int i=0;i<s2.length();i++){
			Character c=s2.charAt(i);
			if(!map.containsKey(c))
				return false;
			else 
			{Integer val=map.get(c);
				if (val==0)
					return false;
				else
				{
					val--;
					map.put(c, val);
				}
			}
		}
		
		return true;
	}

}
