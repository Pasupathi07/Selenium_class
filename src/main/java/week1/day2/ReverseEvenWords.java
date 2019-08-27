package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text = "My dog name is Johny Bolt";
		String[] t1 = text.split(" ");
			for(int i =0;i<=t1.length -1;i++) {
				if(i%2==0) {
					System.out.print(t1[i]);
				}else {
					StringBuffer sb = new StringBuffer(t1[i]);
					System.out.print(" "+sb.reverse()+" ");
				}
						
					}
				
			
	
				
			
			}
			
			
		}
	
