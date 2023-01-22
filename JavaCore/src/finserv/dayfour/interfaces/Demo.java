package finserv.dayfour.interfaces;

public class Demo implements Operation{
	@Override
	public void addition(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("Addition = "+sum);
	}
	public int division(int num1,int num2) {
		return num1+num2+10;
	}
	
	static int mul(int num1,int num2) {
		return num1+num2;
	}
}
