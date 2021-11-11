package assingment6;

public class constructor_object {
	String name;
	int id;
	constructor_object() {
		name="Rajat";
		id=1234;
		System.out.println(name+" "+id);
	}
	constructor_object(String name,int id) {
		
		System.out.println(name+" "+id);
	}

	public static void main(String[] args) {
	constructor_object co=new constructor_object();
	constructor_object co1=new constructor_object("Ravi",1245);
	}

}
