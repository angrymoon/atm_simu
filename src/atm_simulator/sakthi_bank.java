package atm_simulator;
import java.util.*;

public class sakthi_bank {

	public static void main(String[] args) {
	 String name=null,pass=null,n1=null,p1=null;
	 double amount=0,draw=0,a=0,balance=0;
	
	 int option,index;
	Scanner sc=new Scanner(System.in);
	
	ArrayList<String> details;
	ArrayList<Double> details1;
	
	details=new ArrayList<String>();
	details1=new ArrayList<Double>();
	try
	{
	while (true) 
	{
		System.out.println("\t\t\t\t\t ----------------------");
		System.out.println("\t\t\t\t\t WELCOME TO SAKTHI BANK");
		System.out.println("\t\t\t\t\t ----------------------");
		System.out.println("1.Create account:");
		System.out.println("2.Enter into your account");
		System.out.println("3.Depost amount:");
		System.out.println("4.Withdraw amount:");
		System.out.println("5.Balance enquiry:");
		System.out.println("6.Exit");

		option=sc.nextInt();
		switch(option)
		{
		
		case 1:
			for (int i = 0; i < 2; i++) {
	            
			System.out.println("Enter your name ");
			name=sc.next();
			details.add(name);
			System.out.println("Enter your passwordd ");
			pass=sc.next();
			details.add(pass);
			System.out.println("your account is created ");
			}
			break;
			
			
		
		case 2:
			System.out.println("Enter your userid ");
			n1=sc.next();
			System.out.println("Enter your password ");
			p1=sc.next();
			if(n1.equals(name)&&p1.equals(pass)) {
				System.out.printf("Glad to meet you MR/MRS/MISS   %S",n1);
			}
			else {
				System.out.println("please enter the userid or password correctly");
			}
			break;
		
		case 3:
			System.out.println("Enter the amount to be deposited ");
			amount=sc.nextDouble();
			if(n1.equals(name)&&p1.equals(pass)) {
				balance=balance+amount;
				details1.add(balance);
				System.out.printf("your amount %f is deposited successfully\n ",amount);
			}
			
			break;
		
		case 4:
			System.out.println("Enter your amount to be debited ");
			draw=sc.nextDouble();
			if(n1.equals(name)&&p1.equals(pass)) {
				balance=balance-draw;
				System.out.printf("your amount %f is debited successfully ",draw);
				details1.add(draw);
			}
			break;
		
		case 5:
			if(n1.equals(name)&&p1.equals(pass)) {
				System.out.println("The balance is "+balance);
				}
		
			break;
	
		case 6:
			System.out.println("\t\t\t\t\t -------------------------------");
			System.out.println("\t\t\t\t\t THANK YOU FOR USING SAKTHI BANK");
			System.out.println("\t\t\t\t\t -------------------------------");
			break;
			default:
				System.out.println("Please enter a valid choice");
			if(option==6)
			{
				break;
			}


		
		}//switch end
	
	}//while end
	
	}catch(NullPointerException ex) {
		System.out.println("ERROR OCCURED"+ex);
		
	}//catch end
	}//main end

}//class end
