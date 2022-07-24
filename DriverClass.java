

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {  //show menu
	public static void main(String args[]) {
		Employee employee1 = new Employee("Harshit","Choudary");
		String generatedEmail;
		char[] generatedPassword;
		CreatingCredential cService= new CreatingCredential();
		Scanner scan =new Scanner(System.in);
		int choice;
		
		
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical Dept.");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal Dept.");
		
		choice=scan.nextInt();
		if(choice==1) {
			generatedEmail = cService.generateEmailAddress(employee1.getFirstName(),employee1.getLastName(),"technical");
		generatedPassword= cService.generatePassword();
		cService.showCredentials(employee1, generatedEmail, generatedPassword);
			}
		
		else if(choice==2) {
			generatedEmail = cService.generateEmailAddress(employee1.getFirstName(),employee1.getLastName(),"admin");
			generatedPassword= cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if(choice==3) {
			generatedEmail = cService.generateEmailAddress(employee1.getFirstName(),employee1.getLastName(),"HR");
			generatedPassword= cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if(choice==4) {
			generatedEmail = cService.generateEmailAddress(employee1.getFirstName(),employee1.getLastName(),"legal");
			generatedPassword= cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else 
			System.out.println("enter a valid choice");
			
	
		
	}

}