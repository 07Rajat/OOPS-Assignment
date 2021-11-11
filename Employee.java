package assingment6;
import java.util.Scanner;

public class Employee {
	String name;
	int hour=8;
	int salary=50000;
		void getinfo(int salary) {
			System.out.println("Basic salary is "+salary);
			System.out.println("Hours per day "+hour);
		}
		void Addsal() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your salary");
			int salary= sc.nextInt();
			if(salary<50000) 
				salary+=10000;
			System.out.println("Your salary is "+salary);
			System.out.println("Enter your hours work");
		}
		void Addwork() {
			Scanner sc = new Scanner(System.in);
			int hour = sc.nextInt();
			System.out.println("Hours per day work "+hour);
			System.out.println("Enter your salary");
			int salary1=50000;
			int salary=sc.nextInt();
			if(hour>6)
				 salary+=5000;
			System.out.println("Your more hour salary is "+salary);
			
		}
	public static void main(String[] args) {
				Employee e= new Employee();
				e.getinfo(30000);
				e.Addsal();
				e.Addwork();

	}

}
