package staticNonstatic;

public class UserOfSuperThis  {
	int num1= 20;   //global variable
	
	public static void main(String[] args) {
		
		UserOfSuperThis use =new UserOfSuperThis();
		use.add();
	}
	
	public void add()
	{
		int num2=30;     //local variable
		int sum=this.num1+num2;                    // Use of this keyword
		System.out.println("Addition ="+ sum);
	}

}
