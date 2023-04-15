package com.ciq.methodreference;

public class LambdaExpression {
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<=10;i++) {
				System.out.println("child method");
			}

		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main method");
		}
		}
	
	
	}


