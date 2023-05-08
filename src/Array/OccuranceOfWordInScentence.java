package Array;

import java.util.LinkedHashSet;

public class OccuranceOfWordInScentence {
	
public static void main(String[] args) {
		
		//step:1
		//when it is a statement
		//String s="lily brought a lily to the lily pond";
		
		String s="hello all hello india hello all people";
		String[] arr = s.split(" ");
		//num of elements in array is always n+1;
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		//add elements to set
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		//iterate word by word in a set
		for(String word:set) {
			//initialize count
			int count=0;
			//check if the words are repeated in set and string array
			for(int i=0;i<arr.length;i++) {
				if(word.equals(arr[i])) {
					count++;
				}
			}
			System.out.println(word+"====>"+count);
		}
		
	}


}
