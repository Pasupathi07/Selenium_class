package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		String txt = "Testleaf";
		char[] charArray = txt.toCharArray();
		System.out.println(charArray[2]);
		for(int i=0;i<charArray.length;i++) {
			
		System.out.println(charArray[i]);

	}
		for(int i=charArray.length-1;i>=0;i--) {
			
		System.out.println(charArray[i]);

	}
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.println(txt.charAt(i));
		}
			
		

}}
