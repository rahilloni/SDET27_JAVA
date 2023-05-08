package ArrayPractice;

import java.util.LinkedHashSet;

public class OccuranceOfCharInString {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		String s="Asshoole";
		for(int i=0; i<s.length(); i++)
		{
			h.add(s.charAt(i));
			
		}
		for(char ch:h)
		{
			int count=0;
			for(int i=0;i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
		System.out.println(ch+"="+count);
		}
	}

}
