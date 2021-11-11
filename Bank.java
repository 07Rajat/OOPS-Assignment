package assingment6;

public class Bank {
		String name="Rajat";
		int accountnum=12345;
		int balance=50000;
		static int bankiifc=12334;
		static String bankname="ICICI";
	class savingaccount {
		void data() {
			System.out.println("Account type "+accountnum);
			System.out.println("Account holder name "+name);
		}
		void show() {
			System.out.println("Saving / B.Account "+balance);
			
		}
		
	}
	static class Banner {
		void show() {
			System.out.println("IIFC Code=12334");
			System.out.println("Bank name ICICI");
		}
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		Bank.Banner n=new Banner();
		n.show();
		Bank.savingaccount m=b.new savingaccount();
		m.show();
		m.data();
	}
}
