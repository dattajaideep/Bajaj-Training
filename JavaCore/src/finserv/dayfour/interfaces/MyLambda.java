package finserv.dayfour.interfaces;

public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Functional Interface can be implemeted without being used by some other class
		Operation ref = (num1,num2)->{
			int sum=num1+num2;
			System.out.println("Addition = "+sum);
		};
		ref.addition(100,200);
		ref.addition(200,400);
	}

}
