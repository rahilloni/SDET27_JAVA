package Array;

public class MinElement {

		public static void main(String[] args) {
			int[] a1= {5,1,56,23,100,9};
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
			System.out.println("============================");
			System.out.println("min element====>"+a1[0]);
		}
}
