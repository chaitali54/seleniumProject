package staticNonstatic;

public class UserOfSper extends UserOfSuperThis {

	
	public static void main(String[] args) {
		
		UserOfSper usesuper =new UserOfSper();
		usesuper.mul();
		
	}
	public void mul()
	{
		int num2=30;     //local variable
		int mul=super.num1*num2;                   // Use of super keyword
		System.out.println("Multiplication ="+ mul);
	}

}
