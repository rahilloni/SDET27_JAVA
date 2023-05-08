package Array3;

import java.util.LinkedHashSet;

public class GetDuplicateIntInAnArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,2,4,1};      //o/p: 1,2
			
		//create a set
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		//add all the elements of an array to the set
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		//compare the element of set with the element of an array
		for(Integer n:set)
		{
			int count=0;
			for(int i=0; i<arr.length;i++)
			{
				if(n==arr[i])
				{
					count++;
				}
			}
			
			if(count>1)
			{
				System.out.print(n+" ");
			}
		}
	}

}
