package atm_simulator;
import java.util.*;



public class sakthi_bank {

	public static void main(String[] args) {
	 String name=null,pass=null,n1=null,p1=null;
	 double amount=0,draw=0;
	
	 int option,index;
	Scanner sc=new Scanner(System.in);
	
	ArrayList<BankAccount> bank =new ArrayList<BankAccount>();
	BankAccount d1;
	
	
	
	try
	{
	while (true) 
	{
	
		System.out.println("\t\t\t\t\t ----------------------");
		System.out.println("\t\t\t\t\t WELCOME TO SAS BANK");
		System.out.println("\t\t\t\t\t ----------------------");
		System.out.println("1.Create and Enter into your account");
		System.out.println("2.Deposit amount:");
		System.out.println("3.Withdraw amount:");
		System.out.println("4.Balance enquiry:");
		System.out.println("5.Exit");
		

		option=sc.nextInt();
		switch(option)
		{
		
		case 1:
		
	            
			System.out.println("Enter your name ");
			name=sc.next();
			System.out.println("Enter your password ");
			pass=sc.next();
			d1=new BankAccount(name, pass);
			bank.add(d1);
			break;
			
			
		
		case 2:
			System.out.println("Enter your userid ");
			n1=sc.next();
			System.out.println("Enter your password ");
			p1=sc.next();
			for(BankAccount b:bank)
			{
				if(b.name.equals(n1)&&b.password.equals(p1))
				{
					System.out.print("Enter your amount to be deposited");
					
					amount=sc.nextDouble();
					b.balance=b.balance+amount;
					System.out.printf("Your amount %f is deposited successfully",amount);
				}
				else {
					System.out.print("Please check your UserID or Password");
				}
			}
			
			break;
		
		case 3:
			System.out.println("Enter your userid ");
			n1=sc.next();
			System.out.println("Enter your password ");
			p1=sc.next();
			for(BankAccount b:bank)
			{
			if(b.name.equals(n1)&&b.password.equals(p1))
			{
				System.out.print("Enter your amount to be credit");
				
				draw=sc.nextDouble();
				b.balance=b.balance-draw;	
				System.out.printf("Your amount %f is credit successfully",draw);
				
			}else {
				System.out.print("Please check your UserID or Password");
			}
			}

			break;
		
		case 4:
			
			System.out.println("Enter your userid ");
			n1=sc.next();
			System.out.println("Enter your password ");
			p1=sc.next();
			for(BankAccount b:bank)
			{
			if(b.name.equals(n1)&&b.password.equals(p1))
			{
			
				System.out.printf("BALANCE AMOUNT IN YOUR ACCOUNT %f",b.balance);
				
			}else {
				System.out.print("Please check your UserID or Password");
			}
			}
			break;
	
		case 5:
			System.out.println("\t\t\t\t\t -------------------------------");
			System.out.println("\t\t\t\t\t THANK YOU FOR USING SAS BANK");
			System.out.println("\t\t\t\t\t -------------------------------");
			break;
			default:
				System.out.println("Please enter a valid choice");
			if(option==5)
			{
				break;
			}


		
		}//switch end
	
	}//while end
	
	}catch(InputMismatchException ex) {
		System.err.println("ERROR OCCURED, PLEASE USE ONLY NUMBERS  ");
		
	}//catch end
	}//main end

}//class end
