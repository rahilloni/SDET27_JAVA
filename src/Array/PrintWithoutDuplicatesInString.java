package Array;

import java.util.LinkedHashSet;

public class PrintWithoutDuplicatesInString {
	//linked hashset follows insertion order
		//hashset gives in random order
		
		public static void main(String[] args) {
			LinkedHashSet h=new LinkedHashSet();
			String s="Hello World";
			for(int i=0;i<s.length();i++) {
				h.add(s.charAt(i));
			}
			System.out.println(h);
			for(Object ch:h) {
				System.out.print(ch);
			}
		}
}
