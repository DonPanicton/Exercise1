import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");

		System.out.print("Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		HelloUser user = new HelloUser(s);
		user.greetUser();
		scan.close();
	}

}
