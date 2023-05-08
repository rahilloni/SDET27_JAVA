package ArrayPractice;

import java.util.LinkedHashSet;

public class OccuranceOfWordInScentence {
	
	public static void main(String[] args) {
		
		String s="Hello Hello How are you you";
		String[]arr=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		for(String word:arr)
		{
			int count=0;
			for(int i=0; i<arr.length;i++)
			{
				if(word.equals(arr[i]))
				{
					count++;
				}
			}
		System.out.println(word+"="+count);
		}
	}

}
