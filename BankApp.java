/*Developed by:
	1. Kiran Lohare.
	2. Mamata Dahiwal.
	3. Suraj Kurade.*/
package com.velocity.bank;
import java.util.Scanner;
public class BankApp {
	String name;
	String dob;
	char gender;
	double mobno;
	String address;
	String acctype;
	String email;
	int accno;
	String pwd;
	float ammount;
	int progno;
	
	Scanner sc = new Scanner(System.in);
	
	BankApp(){
		accno=4000;
		pwd="velocity";
		ammount=1000;
	}

	public void createAccount() throws Exception {
		System.out.println("\t\t\t==========================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tACCOUNT OPENING FORM\t\t\t\t");
		System.out.println("\t\t\t=========================================================================================================================================");
		
		// 1.Name
		System.out.println("\t\t\t=========================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tPLEASE ENTER YOUR NAME\t\t\t\t");
		System.out.println("\t\t\t=========================================================================================================================================");
		while (true) {
			System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
			name = sc.next();
			if (name.length() == 0) {
				System.out.println("\t\t\t\t\t\t\tInvalid Name...! Please Retry");
			} else {
				break;
			}
		}

		// 2.DOB
		System.out.println("\t\t\t=========================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tPLEASE ENTER YOUR DATE OF BIRTH\t\t\t\t");
		System.out.println("\t\t\t=========================================================================================================================================");
		while (true) {
			System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
			dob = sc.next();
			if (dob.length() == 0 && dob.length() <= 10) {
				System.out.println("\t\t\t\t\t\t\tInvalid Date...! Please Retry");
			} else {
				break;
			}
		}

		// 3.Gender
		System.out.println("\t\t\t=========================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tPLEASE SPECIFY YOUR GENDER(M/F)\t\t\t\t");
		System.out.println("\t\t\t=========================================================================================================================================");		while (true) {
		System.out.print("\t\t\t\t\t\t\t\t\t\t");
			gender = sc.next().charAt(0);
			if ((!(gender == 'M')) && (!(gender == 'F'))) {
				System.out.println("\t\t\t\t\t\t\tInvalid Selction...! Please Retry");
			} else {
				break;
			}
		}

		// 4.Mob Number
		System.out.println("\t\t\t=========================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\tPLEASE ENTER YOUR MOBILE NUMBER\t\t\t\t");
		System.out.println("\t\t\t=========================================================================================================================================");while (true) {
			System.out.print("\t\t\t\t\t\t\t\t\t\t");
			mobno = sc.nextLong();
			if (mobno < 1000000000l || mobno > 9999999999l) {
				System.out.println("\t\t\t\t\t\t\tInvalid Mobile Number...! Please Retry");
			} else {
				break;
			}
		}

		// 5.Address
		boolean b=false;
		System.out.println("\t\t\t=========================================================================================================================================");		
		System.out.println("\t\t\t\t\t\t\t\t\tPLEASE ENTER YOUR ADDRESS\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");
		  while(true) 
		  {
			  if(b)
			  {
				  System.out.print("\t\t\t\t\t\t\t\t\t\t");
			  }
			  address = sc.nextLine();
			  if(b)
			  {
				  if(address.length()<=5) 
				  {
					  System.out.println("\t\t\t\t\t\t\tInvalid Address...! Please Retry"); 
				  } 
				  else
				  { 
					  break; 
				  } 
			  }
			  b=true;
		  }
		 
		// 6.Account type
		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tPLEASE SELECT ACCOUNT TYPE\t\t\t\t\n");
		System.out.println("\t\t\t\t\t\t\t\t1.)Current account \t\t\t\t\t\t2.)Savings account\n \n\t\t\t\t\t\t\t\t3.)Salary account \t\t\t\t\t\t4.)Fixed account\n\n\t\t\t\t\t\t\t\t5.)Recurring account");
		System.out.println("\t\t\t=====================================================================================================================================");
		while (true) 
		{
			System.out.print("\t\t\t\t\t\t\t\t\t\t");
			acctype = sc.next();
				if ((int) acctype.length() < 1 || (int) acctype.length() > 5) 
				{
					System.out.println("\t\t\t\t\t\t\tInvalid Selection...! Please Retry");
				}
				else 
				{
				break;
				}
		}
		// 7.email
		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tPLEASE ENTER YOUR EMAIL\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");
		while (true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			email = sc.next();
			if (!email.contains("@") || !email.endsWith(".com")) {
				System.out.println("\t\t\t\t\t\t\tInvalid Email...! Please Retry");
			} else {
				break;
			}
		}
		// 8.Password
		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tCREATE NEW PASSWORD\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");
		while (true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			pwd = sc.next();
			if (!pwd.contains("@") || pwd.length() <= 6) {
				System.out.println("\t\t\t\t\tYour Password does not meet the required length/complexity...! ");
				System.out.println("\t\t\t\t\t\t\tPlease Retry");
			} else {
				break;
			}
		}
		System.out.println();
		System.out.print("\t\t\t\t\t\t\tVERIFIING ALL DETAILS");
		for (int i = 1; i <= 10; i++) {
			System.out.print(".");
			Thread.sleep(200);
		}
		System.out.println();
		System.out.print("\t\t\t\t\t\t\tCREATING NEW ACCOUNT");
		for (int i = 1; i <= 11; i++) {
			System.out.print(".");
			Thread.sleep(200);
		}
		System.out.println();
		// 9.generating account number
		accno = accno + progno;
		progno++;
		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\t!..ACCOUNT SUCCESSFULLY CREATED..!\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");

		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\t!..YOUR ACCOUNT NO IS : " + accno + "..!\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");
	}

	public void deposit() throws InterruptedException {
		int accno1 = 0;
		float ammount1 = 0;
		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tAMMOUNT DEPOSIT\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");

		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tENTER YOUR ACCOUNT NUMBER\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");;
		while (true) 
		{
			System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
			accno1 = sc.nextInt();
				if (accno!=accno1) 
				{
					System.out.println("\t\t\t\t\t\t\t\t\tPlease check the password and try again...!");
				}
				else 
				{
				break;
				}
		}
		if (accno == (accno1)) 
		{
			System.out.println("\t\t\t=====================================================================================================================================");
			System.out.println("\t\t\t\t\t\t\t\t\t\tENTER YOUR ACCOUNT PASSWORD\t\t\t\t");
			System.out.println("\t\t\t=====================================================================================================================================");
			while (true) 
			{
				System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
				String str = sc.next();
				if (!pwd.equals(str)) 
				{
					System.out.println("\t\t\t\t\t\tPlease check your account number and try again...!\t\t\t\t\t\t");
				}
				else 
				{
					break;
				}
			}
			System.out.println("\t\t\t=====================================================================================================================================");
			System.out.println("\t\t\t\t\t\t\t\t\t\s\s\s\s\s\s ENTER YOUR AMMOUNT TO DEPOSIT\t\t\t\t");
			System.out.println("\t\t\t=====================================================================================================================================");
			System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
			ammount1 = sc.nextFloat();	
			ammount = ammount + ammount1;
			System.out.print("\t\t\t\t\t\t\t\t\tProcessing Deposit Request");
			for (int i = 1; i <= 10; i++) 
			{
				Thread.sleep(200);
				System.out.print(".");
			}
			System.out.println("!");
			System.out.println();
			System.out.println("\t\t\t=====================================================================================================================================");
			System.out.println("\t\t\t\t\t\t\t\t\tCONGRATULATIONS...! TRANSACTION SUCCESSFULL...!"+ammount+"\t\t\t\t");
			System.out.println("\t\t\t=====================================================================================================================================");
	}
}

	public void withdraw() throws InterruptedException 
	{
		int accno1 = 0;
		float ammount1 = 0;
		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tAMMOUNT WITHDRAW\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");

		System.out.println(	"\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\tENTER YOUR ACCOUNT NUMBER\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");;
		while (true) 
		{
			System.out.print("\t\t\t\t\t\t\t\t\t\t");
			accno1 = sc.nextInt();
			if (accno!=accno1) 
				{
					System.out.println("\t\t\t\t\t\tPlease check the password and try again...!\t\t\t\\t\t\t");
				}
				else 
				{
				break;
				}
		}
		
		if (accno == (accno1)) 
		{
			System.out.println("\t\t\t=====================================================================================================================================");
			System.out.println("\t\t\t\t\t\t\t\t\t\tENTER YOUR ACCOUNT PASSWORD\t\t\t\t");
			System.out.println("\t\t\t=====================================================================================================================================");
			while (true) 
			{
				System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
				String str = sc.next();
				if (!pwd.equals(str)) 
				{
					System.out.println("\t\t\t\t\t\tPlease check your account number and try again...!\t\t\t\t\t\t");
				}
				else 
				{
					break;
				}
			}
			System.out.println("\t\t\t=====================================================================================================================================");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\s\s\s\s\s\s ENTER YOUR AMMOUNT TO WITHDRAW\t\t\t\t");
			System.out.println("\t\t\t=====================================================================================================================================");
			while (true) 
			{
				System.out.print("\t\t\t\t\t\t\t\t");
				ammount1 = sc.nextFloat();
				if (ammount1>ammount) 
				{
					System.out.println("\t\t\t\t\t\t Insuffient funds Re-enter Ammount...!\t\t\t\t\t\t");
				}
				else 
				{
					break;
				}
			}
			ammount = ammount - ammount1;
			System.out.print("\t\t\t\t\t\tProcessing Withdrawal Request");
			for (int i = 1; i <= 10; i++) 
			{
				Thread.sleep(200);
				System.out.print(".");
			}
			System.out.println("!");
			System.out.println();
			System.out.println("\t\t\t=====================================================================================================================================");
			System.out.println("\t\t\t\t\t\t\t\t\tCONGRATULATIONS...! TRANSACTION SUCCESSFULL...!"+ammount+"\t\t\t\t");
			System.out.println("\t\t\t=====================================================================================================================================");
		}
		
	}
	public void balanceCheck() throws InterruptedException
	{
		
		System.out.println("\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\tBALANCE CHECK\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");

		int accno1 = 0;
		System.out.println(	"\t\t\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t\t\t\tENTER YOUR ACCOUNT NUMBER\t\t\t\t");
		System.out.println("\t\t\t=====================================================================================================================================");;
		while (true) 
		{
			System.out.print("\t\t\t\t\t\t\t\t");
			accno1 = sc.nextInt();
				if (accno!=accno1) 
				{
					System.out.println("\t\t\t\t\t\tPlease check the password and try again...!\t\t\t\\t\t\t");
				}
				else 
				{
				break;
				}
		}
		
		if (accno == (accno1)) 
		{
			System.out.println("\t\t\t=====================================================================================================================================");
			System.out.println("\t\t\t\t\t\t\t\t\tENTER YOUR ACCOUNT PASSWORD\t\t\t\t");
			System.out.println("\t\t\t=====================================================================================================================================");
			while (true) 
			{
				System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
				String str = sc.next();
				if (!pwd.equals(str)) 
				{
					System.out.println("\t\t\t\t\t\tPlease check your account number and try again...!\t\t\t\t\t\t");
				}
				else 
				{
					break;
				}
			}
			System.out.print("\t\t\t\t\t\tProcessing Balance Check Request");
			for (int i = 1; i <= 10; i++) 
			{
				Thread.sleep(200);
				System.out.print(".");
			}
			System.out.println("!");
			System.out.println();
			System.out.println("\t\t\t=====================================================================================================================================");
				System.out.println("\t\t\t\t\t\t\t\t\tAVAILABLE BALANCE : "+ammount+"\t\t\t\t");
				System.out.println("\t\t\t=====================================================================================================================================");
		}
	}

	public static void main(String a[]) throws Exception 
	{
		BankApp bankapp=new BankApp();
		@SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		String check;
		while(true)
		{
			System.out.println("\t\t\t==========================================================================================================================================");
			System.out.println("\t\t\t+                                                            WELCOME                                                                     +");
			System.out.println("\t\t\t==========================================================================================================================================");
			System.out.println("\t\t\t+                         1. Account Opening                                           3. Balance Enquiry                                +");
			System.out.println("\t\t\t+                                                                                                                                        +");
			System.out.println("\t\t\t+                         2. Cash Withdrawal                                           4. Cash Deposit                                   +");
			System.out.println("\t\t\t==========================================================================================================================================");
			while(true) 
			{
				System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t");
				byte b = sc1.nextByte();
				if(b==1)
				{
					bankapp.createAccount();
					break;
				}
				else if(b==2)
				{
					bankapp.withdraw();
					break;
				}
				else if(b==3)
				{
					bankapp.balanceCheck(); 
					break;
				}
				else if(b==4)
				{
					bankapp.deposit();
					break;
				}
				else
				{
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\tInvalid Selection...!");
					System.out.println("\t\t\t\t\t\t\t\tPlease Retry");
				}
			}
			System.out.println("\t\t\t==========================================================================================================================================");
			System.out.println("\t\t\t\t\t\t\tWould you like to continue with another transaction....!(Y/N)");
			System.out.println("\t\t\t==========================================================================================================================================");
			System.out.print("\t\t\t\t\t\t\t\t");
			check=sc1.next();
			if(check.equals("n"))
			{
				System.out.println("\t\t\t==========================================================================================================================================");
				System.out.println("\t\t\t\t\t\t\t\t\t\t!.......THANK YOU FOR CHOOSING US.......!");
				System.out.println("\t\t\t==========================================================================================================================================");
				System.exit(1);
			}
		}
	}
}
