package com.testdemo;

public class TestException {
	
	public void add() {
		
		System.out.println("calling add method!..");
		try {
			int result = 10/0;
		}
		catch(NullPointerException e) {
		System.out.println(e);	
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("calling finally block");
		}
	}
	
	public void testException(int x) throws CustomException {
		System.out.println("test Exception...");
		if (x < 10){
			throw new CustomException("please select valid number");
		}
		else {
			System.out.println("you are enter valid ");
		}
		
	}
	

	public static void main(String[] args) throws CustomException {
		System.out.println("calling main method..");
		TestException t = new TestException();
		t.add();
		
		t.testException(20);

	}

}

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

