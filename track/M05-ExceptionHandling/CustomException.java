// Create a Custom Exception for DL (Driving Licence) Application
import java.util.Scanner;

class DrivingLicence {
	int age;
	void takeUserAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
	}
	void verify() throws UnderAgeException,OverAgeException {
		if(age<18) {
//			UnderAgeException uae = new UnderAgeException();
//			throw uae;
			throw new UnderAgeException();
		}
		else if(age > 65) {
			throw new OverAgeException();
		}
		else {
			System.out.println("Driving Licence will be issued...");
		}
	}

}

class OverAgeException extends Exception {
	OverAgeException(){
		super("You are tooo old.... take rest");
	}

}

class UnderAgeException extends Exception {
	UnderAgeException(){
		super("You are too young..... still have time to get Licence");
	}

}



public class CustomException {
	public static void main(String[] args) {
		DrivingLicence dl = new DrivingLicence();
		dl.takeUserAge();
		try {
			dl.verify();
		} catch (UnderAgeException|OverAgeException e) {
			e.printStackTrace();
		}
//		catch(OverAgeException e1) {
//			e1.printStackTrace();
//		}

	}
}
