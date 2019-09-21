package atm_simulator;

import java.util.Scanner;

public class create_account {
	
	public String name;
	public String password;
    
	 void  details(String n, String p)
	 {
		 this.name=n;
		 this.password=p;
	 }
	 
	 void getdata()
	 {
		 Scanner sc=new Scanner(System.in);
				 System.out.println("Enter your name ");
		         this.name= sc.next();
		         System.out.println("Enter your password");
		    	 this.name= sc.next();
	 }
	 void printdata()
	 {
	 System.out.println("customer name"+name);
	 System.out.println("customer password"+password);
	 
	 }







}
