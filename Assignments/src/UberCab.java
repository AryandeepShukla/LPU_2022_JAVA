import java.util.Scanner;

public class UberCab {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your amount: ");
		Double amount = sc.nextDouble();
		System.out.println("Enter valid promocode: ");
		int promocode = sc.nextInt();		
		
		sc.close();
		
		final int case1 = 101;
		
		double discount = (amount>=200 && promocode==case1) ? (0.5*amount) : ((amount >=200 && promocode != case1) ? -1 : 0); 
		
		if(discount == -1)
			System.out.println("Please try Using promocode 101");
		else
			amount -=discount;
		
		System.out.println("Amount to be Payed: "+amount);
		
	
	}

}
