
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void getWordCount(FileInputStream fis, String word) throws FileNotFoundException
	{
		int count=0;
		Scanner s=new Scanner(fis);
		while(s.hasNextLine())
		{
			String next=s.next();
			if(next.equalsIgnoreCase(word))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) throws FileNotFoundException  {
//		File fis=new File("C:\\Users\\91935\\OneDrive\\Desktop");
		FileInputStream fis=new FileInputStream("C:\\Users\\91935\\OneDrive\\Desktop");
		getWordCount(fis, "knowledge");
		
		
	}

}
