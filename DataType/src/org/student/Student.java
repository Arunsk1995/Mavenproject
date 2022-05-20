package org.student;



public class Student {
	
	
	private void test(Object... a) {
		for (int i = 0; i <a.length; i++) {
			
		 System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		
	stu.test("Arun",10,43,545,54);

}
	
}