package project.first.week1;

public class Prime {

	public static void main(String[] args) {
		/*// to list a prime number
		int i=2;
		for(int a=1;a<=100;a++) {
			for(i=2;i<=a;i++) {
				if(a%i==0)
					break;
			}
			if(a==i)
				System.out.println(a);
		}*/
		// to find a prime number
		int num = 97;
		int count = 0;
		for (int i =1; i<=num;i++) {
			if(num%i==0) 
				count++;
			
			if(count==2) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a Prime Number");
			}
			}
		}
}