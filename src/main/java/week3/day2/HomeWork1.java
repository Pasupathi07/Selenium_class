package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork1 {

	public static void main(String[] args) {
		List<String> company = new ArrayList<String>();
		company.add("HCL");
		company.add("CTS");
		company.add("Aspire Systems");
		Collections.sort(company);
		//Collections.reverse(company);
		System.out.println(company);

	}

}
