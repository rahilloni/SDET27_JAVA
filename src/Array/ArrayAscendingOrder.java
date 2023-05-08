package Array;

import java.util.Arrays;

public class ArrayAscendingOrder {
	
	//bubble sort
	
		public static void main(String[] args) {
			int [] arr1= {2,1,10,6,9,11};
			for(int i=0;i<arr1.length;i++) {
				
				for(int j=i+1;j<arr1.length;j++) {
					
					if(arr1[i]>arr1[j]) {
						
						int temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(arr1));
		}

}
