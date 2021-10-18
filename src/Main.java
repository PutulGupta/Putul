import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		BankAccount obj1= new BankAccount("XYZ","BA0001");
		obj1.showMenu();
	

	}

}

class BankAccount{
	int balance;
	int previousTransaction;
	String custName;
	String custId;
	
	
	BankAccount(String cName, String cId){
		custName = cName;
		custId = cId;
	}
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction(){
		if(previousTransaction > 0) {
			System.out.println("Deposited..."+balance);
		
			
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn..."+balance);
		}
		else {
			System.out.println("No transations done yet!!!");
		}
		
	}
	void showMenu() {
		char option = '\0';
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome"+ custName);
			System.out.println("Your id is:"+ custId);
			System.out.println("\n");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Previous Transaction");
			System.out.println("E. Exit");
			
			do {
				System.out.println("***************************");
				System.out.println("Enter an option...");
				System.out.println("***************************");
				option = scanner.next().charAt(0);
				System.out.println("\n");
				
				switch(option) {
				case 'A':
					System.out.println("*****************************");
					System.out.println("Balance =" +balance);
					System.out.println("*****************************");
					System.out.println("\n");
					break;
					
				
				case 'B':
					System.out.println("*****************************");
					System.out.println("Enter an amount to deposit...");
					System.out.println("*****************************");
					System.out.println("\n");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
					
					
				case 'C':
					System.out.println("*****************************");
					System.out.println("Balance =" +balance);
					System.out.println("*****************************");
					System.out.println("\n");
					int amount2= scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
					
				case 'D':
					System.out.println("*****************************");
					getPreviousTransaction();
					System.out.println("*****************************");
					System.out.println("\n");
					break;
					
				case 'E':
					System.out.println("*****************************");
					break;
					
				default:
					System.out.println("Invalid Option... Please choose correct option!!!");
					break;
				}
				
				
			}while(option != 'E');
		}
				
	    System.out.println("Thank you for using our services...");
	    
		
	}
}
