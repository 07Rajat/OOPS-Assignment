package assingment6;

public class test {
	static int pointsum(int y[]) {
		int point=0;
		for(int i=0;i<y.length;i++) {
			if(y[i]==5) point+=5;
			else if(y[i]%2==0) point+=1;
			else point+=3;
		}
		
	return point;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(pointsum(a));
		
	}
}
