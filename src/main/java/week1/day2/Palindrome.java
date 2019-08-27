package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String txt = "level";
		char[] charArray = txt.toCharArray();
		String temp="";
		for(int i=charArray.length-1;i>=0;i--) {
			temp=temp+charArray[i];
			System.out.println(charArray[i]);
		}
		if(txt.equals(temp)) {
			System.out.println("Palindrome");
		}else {
		System.out.println("Not a palindrome");
		}
		}

	}

