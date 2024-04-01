package staticNonstatic;

public class staticAndNonstatic {
                  
	static int c=10;           //static global variable
	static int d=40;
	public static void main(String[] args) {
		
		
		staticAndNonstatic stat =new staticAndNonstatic();
		stat.add();
		
		int sub = d-c;
		System.out.println("Substraction= " +sub);
		
		staticAndNonstatic1 stat1= new staticAndNonstatic1();
		int mul=stat1.p * staticAndNonstatic1.q;
		System.out.println("Mul =" + mul);
		
		staticAndNonstatic1 stat2= new staticAndNonstatic1();
		int div=stat2.p / staticAndNonstatic1.q;
		System.out.println("div =" + div);
	}

	public void add()
	{
		int a=20,b=30; //local variable
		int sum= a+b;                              
 		System.out.println("Addition=" + sum);
	}
	
	
}
