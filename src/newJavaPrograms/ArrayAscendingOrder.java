package newJavaPrograms;

public class ArrayAscendingOrder {
	
	public static void main(String[] args) {
		int[]a= {10,50,24,32};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[a.length-1]);
		}
	}

}
