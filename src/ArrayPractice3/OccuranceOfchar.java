package ArrayPractice3;

import java.util.LinkedHashSet;

public class OccuranceOfchar {
	public static void main(String[] args) {
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		String s="Raaheel";
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+"=="+count);
		}
	}

}
