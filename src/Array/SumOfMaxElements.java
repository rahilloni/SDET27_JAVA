package Array;

public class SumOfMaxElements {
	public static void main(String[] args) {
		int[] a1= {23,7,9,10,45,63,12};
		for(int i=0;i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]<a1[j])
				{
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		System.out.println(a1[i]);
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a1[i];
		}
		System.out.println("==================");
		System.out.println("sum====>"+sum);
	}
}
