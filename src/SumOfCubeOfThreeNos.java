
public class SumOfCubeOfThreeNos {
	
	public static void main(String[] args) {
		int n=12;
		int sum=0;
		int ld;
		while(n>0)
		{
			ld=n%10;
			sum=sum+ld*ld*ld;
			n=n/10;
			
		}
		System.out.println(sum);
	}
}
