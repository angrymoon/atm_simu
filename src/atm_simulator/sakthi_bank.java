package atm_simulator;
import java.util.*;

public class sakthi_bank {

	public static void main(String[] args) {
	 String name,pass;
	 double amount=0,draw=0,a=0;
	
	 int option;
	Scanner sc=new Scanner(System.in);
	ArrayList<String> details;
	details=new ArrayList<String>();
	while (true) 
	{
		System.out.println("\t\t\t\t\t ----------------------");
		System.out.println("\t\t\t\t\t WELCOME TO SAKTHI BANK");
		System.out.println("\t\t\t\t\t ----------------------");
		System.out.println("1.Create account:");
		System.out.println("2.Depost amount:");
		System.out.println("3.Withdraw amount:");
		System.out.println("4.Balance enquiry:");
		System.out.println("5.Exit");

		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter your name ");
			name=sc.next();
			details.add(name);
			System.out.println("Enter your password ");
			pass=sc.next();
			details.add(pass);
			System.out.println("your account is created ");
			break;
		case 2:
			System.out.println("Enter the amount to be deposited ");
			amount=sc.nextDouble();
			System.out.printf("your amount %f is deposited successfully\n ",amount);
			break;
		case 3:
			System.out.println("Enter your amount to be debited ");
			a=sc.nextDouble();
			draw=amount-a;
			System.out.printf("your amount %f is debited successfully ",a);

				break;
		case 4:
			System.out.println("your balance amount is: "+draw);

					break;
		case 5:
			System.out.println("\t\t\t\t\t -------------------------------");
			System.out.println("\t\t\t\t\t THANK YOU FOR USING SAKTHI BANK");
			System.out.println("\t\t\t\t\t -------------------------------");
			break;
			default:
				System.out.println("Please enter a valid choice");
			if(option==5)
			{
				break;
			}


		
		}
	
	}
	

	}

}
