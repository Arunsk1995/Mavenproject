package org.college;

public class College extends Student {
         private void collegeName() {
         System.out.println("st josephs college of Engineerig");
		}
         
        private void collegeCode() {
        System.out.println("1997");
		} 
         
         private void collegeRank() {
        System.out.println(" 23rd");
		}
         
         
         public static void main(String[] args) {
			College c = new College();
			c.collegeName();
			c.collegeCode();
			c.collegeRank();
			c.deptName();
			c.hostelName();
			c.studentName();
			c.studentId();
			c.studentDept();
		}
         
         
}
