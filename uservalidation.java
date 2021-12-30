package JunitMain;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class user_validation {
	
	static Scanner scan = new Scanner(System.in);
	
	public static boolean firstname() {
		
		System.out.println("Enter firstname : ");
		String firstname = scan.next();
		String regex = "[A-Z]{1}[a-z]{2,5}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(firstname);
		System.out.println("The first name is : " +firstname + "->" + m.matches());
		return m.matches();
	}
	
	public static boolean lastname() {
		
		System.out.println("Enter lastname : ");
		String lastname = scan.next();
		String regex = "[A-Z]{1}[a-z]{2,5}";
		Pattern  pattern= Pattern.compile(regex);
		Matcher m = pattern.matcher(lastname);
		System.out.println("The last name is : " +lastname + "->" + m.matches());
		return m.matches();
	}
	
	public static boolean email(String email) {
		
		System.out.println("Enter email address : ");
		String emailid = scan.next();
		String regex = "^[A-Za-z0-9.+-]+@[a-z0-9]+[.][a-z]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(emailid);
		System.out.println("The enter email is : "+emailid + "->" + m.matches());
		return m.matches();
	}
	
	public static boolean mobilenumber() {
		
		System.out.println("Enter mobile number : ");
		String number = scan.next();
		String regex = "(0|91 )[9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(number);
		System.out.println("The enter mobile number is : " +number + "->" + m.matches());
		return m.matches();
	}
	
	public static boolean Rule1() {
		System.out.println("Enter the password with minimum 8 char : ");
		String passwordchar = scan.next();
		String regex = "[A-Za-z]{8,}";
		Pattern pswd = Pattern.compile(regex);
		Matcher m = pswd.matcher(passwordchar);
		System.out.println("The character password is : " +passwordchar + "->" + m.matches());
		return m.matches();
	}
	
	public static boolean Rule2() {
		System.out.println("Enter the password with at least 1 Upper case : ");
		String passworduppercase = scan.next();
		String regex = "^(?=.*[a-z])(?=.*[A-Z]){8,}.*$";
		Pattern pswd = Pattern.compile(regex);
		Matcher m = pswd.matcher(passworduppercase);
		System.out.println("The Upper case is : " +passworduppercase + "->" + m.matches());
		return m.matches();
	}
	
	public static boolean Rule3() {
		System.out.println("Enter the at least 1 numeric number in password : ");
		String number = scan.next();
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){8,}.*$";
		Pattern pswd = Pattern.compile(regex);
		Matcher m = pswd.matcher(number);
		System.out.println("The numeric number is: " +number + "->" + m.matches());
		return m.matches();
	}
	
	public static boolean Rule4() {
		System.out.println("Enter the 1 special character : ");
		String specialcharacter = scan.next();
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[-+(){}_!@#$%^&*., ?]){8,}.*$";
		Pattern pswd = Pattern.compile(regex);
		Matcher m = pswd.matcher(specialcharacter);
		System.out.println("special character : " +specialcharacter + "->" + m.matches());
		return m.matches();
	}
	
	

}
