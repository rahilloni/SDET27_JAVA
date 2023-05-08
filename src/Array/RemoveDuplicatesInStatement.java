package Array;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInStatement {

	public static void main(String[] args) {
		String s="lilly loves lilly so she bougth a lilly from a lilly pond";
		String[] arr = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		for(String word:set) {
			System.out.print(word+" ");
		}
	}
}
