package net.java_school.examples;

public class Test {

	public static void main(String[] args) {
		
		//1.The class always wins.
		C1Class c1 = new C1Class();
		System.out.println(c1.hello());
		
		//2. Sometimes, you must explicitly override the default method you choose and call it. 
		C2Class c2 = new C2Class();
		System.out.println(c2.hello());
	}

}
