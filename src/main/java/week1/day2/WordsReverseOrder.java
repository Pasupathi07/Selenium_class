package week1.day2;

public class WordsReverseOrder {

	public static void main(String[] args) {
		String state = "Welcome to Testleaf Chennai";
		String[] st = state.split(" ");
		System.out.println(st.length);
		for(int i=st.length-1;i>=0;i--)
		System.out.println(st[i]);

	}

}
