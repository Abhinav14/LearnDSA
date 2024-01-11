package swap;

public class SwapEasy {

	public static void main(String[] args) {
		
		int num = 23, a = 0, b = 0, temp = 0;
		System.out.println("Number before swap : "+num);
		
		a = num/10;
		b = num%10;
		temp = a;
		a = b;
		b = temp;
		num = a*10+b;
		
		System.out.println("Bumber after swap :"+num);
		
	}

}
