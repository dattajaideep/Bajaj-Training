package finserv.daythree.taskexceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class mulcatch {
	public static void main(String[]args) {
		try(Scanner sc=new Scanner(System.in)){
			int age=sc.nextInt();
			int year=sc.nextInt();
			int b=sc.nextInt();
			if(age>18) {
				if(year>2025) {
					System.out.println("Validated");
				}
				else {
					throw new Expiryexception("Your Id need to be renewed");
				}
			}
			else {
				throw new InvalidAgeException("Age nedds to be above 18");
			}
			int c=age/b;
			System.out.println(c);
			File file = new File("example.txt");

	        // Check if the file exists
	        if (!file.exists()) {
	            throw new FileNotFoundException("File not found: " + file.getName());
	        }
		}catch(NullPointerException e) {
			System.out.println("String is null"+" "+e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Expiryexception e) {
			System.out.println(e.getMessage());
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
