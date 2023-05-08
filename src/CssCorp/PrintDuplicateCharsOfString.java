package CssCorp;

import java.util.LinkedHashSet;

public class PrintDuplicateCharsOfString {
	
	public static void main(String[] args) {
		
		String s="Raaheel";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		
		for(Character ch:set)
		{
			int count = 0;
			if(ch==s.charAt(i))
			{
				count++;
				
			}
			if(count>1)
			{
				System.out.println(s.charAt(i));
			}
		}
		
		}
		
			
		
		
	}

}
