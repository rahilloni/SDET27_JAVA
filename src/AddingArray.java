import java.util.Arrays;

public class AddingArray {
		
		public static void main(String[] args) {
			int[]a= {10,20,40,50};
			int[]b= {2,4,5,6};
			int maxsize = Math.max(a.length, b.length);
			int[] result=new int[maxsize];
			for (int i = 0; i < maxsize; i++) {
				int val1= (i<a.length) ? a[i] :0;
				int val2= (i<b.length) ? b[i] :0;
				result[i]=val1+val2;
			
			}
			System.out.println(Arrays.toString(result));
			
		}
	}


