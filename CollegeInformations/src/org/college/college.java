package org.college;

public class college {
private void collegeName() {
 System.out.println("jit");
}
private void collegeCode() {
 System.out.println("646");
}
private void collegeRank() {
 System.out.println("56");
}
public static void main(String[] args) {
	student sta = new student();
	sta.studentDept();
	sta.studentName();
	sta.studentId();
	Hostel ho = new Hostel();
	ho.hostelName();
	Dept dep = new Dept();
	dep.deptName();
	college col = new college();
	col.collegeCode();
	col.collegeName();
	col.collegeRank();
	
	
	
	
}
}
