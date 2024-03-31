import java.util.Scanner;

public class ATM_INTERFACE {
	
	 private static double balance = 1000; // Initial balance
	 
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Welcome to the ATM!");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Generate Pin");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    withdraw(scanner);
	                    break;
	                case 3:
	                    deposit(scanner);
	                    break;
	                case 4:
	                	generatepin();
	                	break;
	                case 5:
	                    System.out.println("Thank you for using the ATM!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void checkBalance() {
			System.out.println("Your current balance is: $" + balance);
	    }

	    private static void withdraw(Scanner scanner) {
	        System.out.print("Enter the amount to withdraw: $");
	        double amount = scanner.nextDouble();
	        double balance = 0;
			if (amount > balance) {
	            System.out.println("Insufficient funds.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
	        }
	    }
        
	    private static void deposit(Scanner scanner) {
	        System.out.print("Enter the amount to deposit: $");
	        double amount = scanner.nextDouble();
	        double balance = amount;
	        System.out.println("Deposit successful. New balance: $" + balance);
	    }

	
       private static void generatepin() {
    	   System.out.print("enter the pin:" );
    	   try (Scanner sc = new Scanner(System.in)) {
			sc.nextInt();
		}
    	   //generate 4 number digit
    	   for(int i = 0; i<6 ; i++ ) ;
    		    System.out.println("ATM Pin successful");
    		    }
}