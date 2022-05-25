package projectjava;

import java.util.ArrayList;

public class ArrayListLectureCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList <datatype> varaible name= new arrayList<datatype>();
		ArrayList<String> Sportscars = new ArrayList <String> ();
		
//addvalues 	
		Sportscars.add("BMW");
		Sportscars.add("meow");
		Sportscars.add("hehe");
		Sportscars.add("barkbark bitch");
	
	for (int i = 0; i <Sportscars.size();i++) {
		System.out.println(Sportscars.get(i));
	}
	}
		
//access values
		//Sportscars.get(1);
		//System.out.println(Sportscars.get(1));
		
//change a value in the array list
		//Sportscars.set(0, "uglycar");
		//System.out.println(Sportscars.set(0));
	}


