package assingment6;

public class Toy {
	String name="Elephant toy";
	int price=800;
	static String made_in ="India";
	void Toy() {
		System.out.println(name+" price is "+price);
	}
	void Toy(String name,int price) {
		System.out.println(name+" price is "+price);
	}
	public static class toy {
	void show() {
	String	name="Lion toy price is ";
	int price1=900;
	System.out.println(name+" "+price1);
	}
	}
	public static void main(String[] args) {
		Toy t=new Toy();
		t.Toy();
		t.Toy("Tiger Toy",850);
		Toy.toy y=new toy();
		y.show();
			
	}

}
