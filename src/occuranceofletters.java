
public class occuranceofletters {

	public static void main(String[] args) {
		String s="lilly";
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			int count=1;
			for (int j = i+1; j < s.length(); j++) {
				if (letter==s.charAt(j)) {
					count++;
					break;
				}
			}
			System.out.println(s.charAt(i)+"====="+count);
		}

	}

}
