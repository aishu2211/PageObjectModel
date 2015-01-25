package test.encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Room r = new Room();
		r.setspace(1000);
		School s=new School(r);
		s.teach();
		System.out.println(s.r.getspace());

	}

}
