package swap;

public class SwapOptimized {
	
	public static void main(String[] args) {
		
		int num = 23, a= 0, b = 0;
		System.out.println("Before swap : "+num);
		a = num/10;
		b = num%10;
		
		a = a+b;
		b = a - b;
		a = a - b;
		
		num = a*10+b;
		System.out.println("After swap : "+num);
	}

}
