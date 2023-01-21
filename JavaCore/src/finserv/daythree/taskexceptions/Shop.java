package finserv.daythree.taskexceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Shop {
private static ArrayList<Set<String>> list=new ArrayList<Set<String>>();
	public static void main(String[] args) throws EmptyCartException {
		try {
			Scanner sc=new Scanner(System.in);
			String Id,price,Name;
			//List<Set<String>> list=new ArrayList<Set<String>>();
			System.out.println("Add to cart?");
			String b=sc.next();
			while(b.equalsIgnoreCase("Yes")) {
				Id=sc.next();
				Name=sc.next();
				price=sc.next();
				list.add(World.setCreate(Id,Name,price,b));
				System.out.println("Do you wish to add more");
				b=sc.next();
			}
			if(list.isEmpty()) {
				throw new EmptyCartException("Your cart is empty");
			}
			else {
				System.out.println(list);
			}
		} catch (EmptyCartException e) {
			System.out.println(e);
		}
		catch (InputMismatchException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}

class World{
	public static Set<String> setCreate(String Id,String Name,String price,String b) {
		Set<String> set=new LinkedHashSet<String>();
		set.add(Id);
		set.add(Name);
		set.add(price);
		return set;
	}
}
