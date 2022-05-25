package projectjava;

public class Lec3Arrays2 {

	public static void main(String[] args) {
		//Arrays always fix we cannot add any values later on. 
		//String []Fruits;
		
		String[]Fruits = {"Mango", "Watermelon","Orange","Apple"};
		
		//store your five car brand name for your show room
		
		String[]Cars = {"Lexus", "Camry", "Toyota", "Prius", "RaceCar"};

		//changeing arrays within the index:
		
		Cars[0]= "ABC";
		System.out.println(Cars[0]);
		
		// length of array
		System.out.println(Cars.length);
		
		// change tesla to nissan
		Cars[3]= "MeowMeow";
		System.out.println(Cars[3]); 
	}

}
