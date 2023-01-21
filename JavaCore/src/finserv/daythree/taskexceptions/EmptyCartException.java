package finserv.daythree.taskexceptions;

public class EmptyCartException extends Exception{
	EmptyCartException(String msg){
		super(msg);
	}
}
