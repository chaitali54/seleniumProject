package reverse_numer;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=123, rev_num=0;
	
		System.out.println("Numer is="+ num);  
		
		while(num != 0)   
		{  
			int reminder;
			reminder=num%10;  
			rev_num = rev_num*10 + reminder;  
			num = num/10;  
		}  
		System.out.println("Reverse number="+ rev_num);

	}

}
