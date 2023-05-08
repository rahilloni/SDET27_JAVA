package newJavaPrograms;

import java.util.LinkedHashSet;

public class OccuranceOfcharInAString {
	
	public static void main(String[] args) {
		String s="raaheel";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for (int k = 0; k < s.length(); k++) {
				if(ch==s.charAt(k))
				{
					count++;
				}
			}
			System.out.println(ch+"="+count);
				
		}
	}

}
