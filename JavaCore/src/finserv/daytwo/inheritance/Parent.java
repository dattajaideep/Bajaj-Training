package finserv.daytwo.inheritance;

public class Parent {
	protected int p = 10;     // protected members can be accessed by the child classes. Private can't.
	
	public Parent() {         // Non-parameterized constructors are called automatically through child.
		System.out.println("In parent  non-parameter constructor.");
	}
	public Parent(int p) {
		this.p = p;
		System.out.println("In parameterized constructor.");
	}
	public void display() {
		System.out.println("In parent display.");
	}
}