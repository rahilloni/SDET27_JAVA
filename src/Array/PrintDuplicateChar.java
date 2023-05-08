package Array;

import java.util.LinkedHashSet;

public class PrintDuplicateChar {
	public static void main(String[] args) {
		String s="testyanra";
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			h.add(s.charAt(i));
		}

		for(Character ch:h)
		{
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch+"="+count);
				
			}
		}
	}
}
