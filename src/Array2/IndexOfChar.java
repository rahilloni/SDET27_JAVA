package Array2;

import java.util.LinkedHashSet;

public class IndexOfChar {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		String s="Raaheel";
		for(int i=0;i<s.length();i++) {
			
			h.add(s.charAt(i));
		}
		for(char ch:h) {

			for(int i=0;i<s.length();i++) {
				if(ch == s.charAt(i)) {
					System.out.println("Index of character "+ch+"="+(i+1));
//					break;
				}
			}
		}
	}
}
