package Array;

public class SumOfMinElement {
	
	public static void main(String[] args) {
		int[] a1= {4,1,3,10,6,7};
		for(int i=0;i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]>a1[j]) {
					int temp=a1[i];
				    a1[i]=a1[j];
				    a1[j]=temp;
				}
			}
			 System.out.println(a1[i]);
		}
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a1[i];
		}
		System.out.println("sum====>"+sum);
	}

}
