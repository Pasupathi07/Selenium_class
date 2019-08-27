package week1.day2;

public class IndexToUppercase {

	public static void main(String[] args) {
		String text = "karthikeyan";
		char[] charArray = text.toCharArray();
		for(int i =0;i<=charArray.length-1;i++) {
			char c =charArray[i];
		if(i%2==0) {
			System.out.print(c);
		}
		else {
			System.out.print(Character.toUpperCase(c));
			}
	}

}}
