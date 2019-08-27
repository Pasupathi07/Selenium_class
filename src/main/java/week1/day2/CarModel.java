package week1.day2;

public class CarModel {
	public static void main(String[] args) {
		String [] carModel = {"BMW","Audi","Ford","Rolls Royce","Ferrari","Tata"};
		
		// To print a single model
		System.out.println(carModel[0]);
		// To Print all model using  For Loop.Identify length of a array
		System.out.println(carModel.length);
		for(int i=0;i<carModel.length;i++) {
		
		System.out.println(carModel[i]);
	}
		// To print all model using For Each Loop
		for(String allModel: carModel) {
			System.out.println(allModel);
		}
	}

}
