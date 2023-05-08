package JavaImpPrograms;

public class Pyramid {
	
	public static void add(int a, int b)
	{
		System.out.println("From A");
	}
	
	public void add(int b)
	{
		System.out.println("from b");
	}
	
	public void add(int c, int b, int d)
	{
		System.out.println("from c");
	}
	
	public static void main(String[] args) {
	
		Pyramid.add(20, 30);
		add(10,20);
	}

}
