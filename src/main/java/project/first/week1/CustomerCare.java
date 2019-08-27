package project.first.week1;

public class CustomerCare {

	public static void main(String[] args) {
		int a=10, b=5, c;
		for(int i =1;i<=4;i++) {
			switch(i) {
			case 1:
				c=a+b;
			System.out.println(c);
			break;
			case 2:
				c=a-b;
			System.out.println(c);
			break;
			case 3:
				c=a*b;
				System.out.println(c);
				break;
			default:
				c=a/b;
				System.out.println(c);
			}
		}

	}}


