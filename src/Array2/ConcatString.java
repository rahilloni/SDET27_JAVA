package Array2;

import java.util.Iterator;

public class ConcatString {
	
	public static void main(String[] args) {
		String s="abc"+"xyz";
		for(int i=0; i<s.length()/2;i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(s.length()/2+i));
		}
		}
	}


