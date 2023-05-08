package CssCorp;

import java.util.LinkedHashSet;

public class Duplicateintring {

	public static void main(String[] args) {
		String s="abcddeeff";
		LinkedHashSet set=new LinkedHashSet();
		for (int i = 0; i < s.length(); i++) {
			boolean addedelement = set.add(s.charAt(i));
			if(addedelement==false) {
				System.out.println(s.charAt(i));
				
				
			}
			
		}

	}

}
