package Array2;

public class GetSumOfGroupedNumbersOfString {
	
	public static void main(String[] args) {
		String s="a12b13c10d20";
		int sum=0;
		int Tsum=0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum=sum*10+n;
			}
			else {
				Tsum=Tsum+sum;
				sum=0;
			}
		}
		System.out.println(Tsum+sum);
	}

}
