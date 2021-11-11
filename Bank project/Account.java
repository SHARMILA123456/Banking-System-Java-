
package sharmi_1817145;

import java.util.*;

class Account //this class is imported to the Banking.java to achieve the inheritance
{ 
	
	double bal;
    String a_name;
	private long a_no;
	
	Scanner scanner = new Scanner(System.in);
	
	public void entry()   //get account details from the user using Scanner class
	{
		System.out.println("Enter your account name:");
		  setA_name(scanner.nextLine());
		System.out.println("Enter your account number:");
		  setA_no(scanner.nextLong());
		 System.out.println("Enter your account balance:");
		  bal = scanner.nextDouble();
		  scanner.nextLine();
	}
	public long getA_no() //gets the account number of the user
	{  
		return a_no;
	}
	public void setA_no(long a_no) //sets the account number of the user
	{
		this.a_no = a_no;
	}
	public String getA_name()  //gets the account name of the user
	{
		return a_name;
	}
	public void setA_name(String a_name) //sets the account name of the user
	{
		this.a_name = a_name;
	}
}
	

