package assingment6;

public class Electronic_toy {
	String name="Maruti";
	int modelno=159357;
	int toy_reference=889;
	Electronic_toy() {
		System.out.println(name+" Modelno "+modelno+" Reference num "+toy_reference);
	}

	Electronic_toy(String name,int modelno,int toy_reference) {
		
		System.out.println(name+" Modelno "+modelno+" Reference num "+toy_reference);
	}

	public class printAll extends Toy {
	String name="Fararri";
	int modelnum=98765;
	int toy_reference=889;
	void display() {
	System.out.println(name+" "+modelnum+" "+toy_reference);
	}
	}

    public static class car {
		String name="Hundai";
		 void show1() {
			int modelnum=2589;
			int toy_ref=56;
			System.out.println(name+" "+modelnum+" "+toy_ref);
		}
	}
	public static void main(String[] args) {
		Electronic_toy Et=new Electronic_toy();
		Electronic_toy Et1=new Electronic_toy("Lamborgini",12345,225);
		Electronic_toy.car c= new car();
		c.show1();
		Electronic_toy.printAll pa=Et.new printAll();
		pa.display();
		pa.Toy();
		pa.Toy("Lion", 900);
		
	}
}

