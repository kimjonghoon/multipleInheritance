package net.java_school.examples;

public class Test {

	public static void main(String[] args) {
		
		//1.The class always wins.
		C1Class c1 = new C1Class();
		System.out.println(c1.hello());
		
		//2. Sub interface wins
		C2Class c2 = new C2Class();
		System.out.println(c2.hello());
		
		//3. Sometimes, you should explicitly override and call the default method.
		C3Class c3 = new C3Class();
		System.out.println(c3.hello());
	}

}
