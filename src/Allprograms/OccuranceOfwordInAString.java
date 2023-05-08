package Allprograms;

import java.util.LinkedHashSet;

public class OccuranceOfwordInAString {
	
	public static void main(String[] args) {
		
		String s="I am am Not going to to attend";
		String[] StrArr = s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0; i<StrArr.length;i++) {
			set.add(StrArr[i]);
		}
		
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<StrArr.length;i++)
			{
				if(word.equals(StrArr[i]))
				{
					count++;
				}
			}
			System.out.println(word+"=="+count);
		}
	}

}
