
package sharmi_1817145;

import sharmi_1817145.Account;
import java.util.*;

interface bank_functions       //interface is created for the methods deposit(),withdraw(),checkbalance() which is implemented by the class Bank
{
	  void deposit();
	  void withdraw();
	  void viewbalance();
}

	

class Bank extends Account implements bank_functions   //class Bank inherits the class Balance(present in another file of same package)
                                                       //and also implements the interface bank_functions
{
     int min=100;     //to check the minimum balance in the account
     Bank()
     {
    	 System.out.println("Account details");
     }
	@Override  //implementation of the interface method deposit()
	public void deposit() {
		
		
        double amount = scanner.nextDouble();         //read the input(amount to be deposited) from the user
         bal += amount;                               //updating the account balance with the deposited amount 
         System.out.println(amount + " is Deposited Successfully!!");  // says information about the deposition
	}

	@Override   //implementation of the interface method withdraw()
	public void withdraw() {
		double w_amount = scanner.nextDouble();      //read the input(amount to be withdrawn) from the user
	 try
	 {
		 if (bal>w_amount && bal!=min)              //check whether the balance amount is greater than the withdrawal amount 
		 {                                          //and the balance equals to the minimum balance or not
		 bal -= w_amount;                           //updating the balance after withdrawn
		 System.out.println(w_amount + " is withdrawn!!");   //displaying the amount withdrawn
		 }
		 else
			 throw new Exception();   //throws exception whenever the if condition becomes false
		 
	 }
	 catch(Exception e)   //display the exception thrown by try block
	 {
		 System.out.println("Less balance !! Transaction failed...");
	 }
	 finally         //tells about the minimum balance
	 {
		 System.out.println("Minimum amount of 100 to be maintained!!");
	 }
		
	}
	public void viewbalance()  //displays the account balance amount
	{
     System.out.println("\n*******************************************\n");
     System.out.println("ACCOUNT_NAME      BALANCE\n");
     System.out.format("%-20s%.2f" , a_name , bal);
     System.out.println("\n\n*******************************************\n");
	}
	
	
}

public class Banking{
	
	public static void main(String args[])
	{
		int choice;    //variable choice is used  in switch case to select the operation
		Scanner scanner = new Scanner(System.in);  //creating the Scanner object for reading input from the user
	    Bank obj1 = new Bank();   //object "obj1" is created for class Bank
	    obj1.entry();     //calling the method "entry()" which is present in class Balance in another java file of same package
		 
		do    //do while loop for executing the methods in the Bank class
		{
	    System.out.println("\n===========================================");
		System.out.print("1.DEPOSIT\n2.WITHDRAWAL\n3.CHECK BALANCE\n4.EXIT\n");
		System.out.println("===========================================");
		System.out.println("Enter your choice:");
		choice = scanner.nextInt();
	
		switch(choice)
		{
		case 1:  //calling the method deposit()
		{
			System.out.println("Enter the amount to be deposited:");
			obj1.deposit();
  			
			break;
		}
		case 2:   //calling the method withdraw()
		{
			System.out.println("Enter the amount to be withdrawn:");
            obj1.withdraw();
			
			break;
		}
		case 3:    //calling the method checkbalance()
		{	 
			
			obj1.viewbalance();
			break;
		}
		
		}
		}while(choice<4);
		
	}

}

