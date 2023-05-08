package newJavaPrograms;

import java.util.LinkedHashSet;

public class OccuranceOfWordInAScentence {
	public static void main(String[] args) {
		
		String s="Raheel Raheel is an Engineer";
		String[]arr=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			
		}
		for(String word:set)
		{
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j].equals(word))
				{
					count++;
				}
			}
			System.out.println(word+"="+count);
		}
		
	}

}
