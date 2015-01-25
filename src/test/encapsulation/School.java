package test.encapsulation;

public class School extends Institution {
	
	//School is a institution - Inheritance
		//School has a room - Encapsulation
	
	Room r = null;
	//constructor
	public School(Room r){
		this.r=r;
	}

}
