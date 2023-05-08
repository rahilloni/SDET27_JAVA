
public class ArrayPrimeNo {

	//a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
	
	public static void main(String[] args) {

		int []a= {2,3,4,5,6,7,8};
		
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int count=0;
			for (int j = 2; j <=num; j++) {

				if(num%j==0) {
					count++;
				}
			}

			if (count==1) {
				System.out.print(a[i]);
			}
		}

	}
}
