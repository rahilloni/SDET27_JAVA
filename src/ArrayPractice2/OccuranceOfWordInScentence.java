package ArrayPractice2;

import java.util.LinkedHashSet;

public class OccuranceOfWordInScentence {
	
	public static void main(String[] args) {
		
		String s="Hello Hello guys welcome to the channel";
		String[] strArr=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<strArr.length;i++)
		{
			set.add(strArr[i]);
		}
		for(String word:set)
		{
			int count=0;
			for(int i=0; i<strArr.length;i++)
			{
				if(word.equals(strArr[i]))
				{
					count++;
				}
			}
			
		System.out.println(word+"="+count);
		}
	}

}
