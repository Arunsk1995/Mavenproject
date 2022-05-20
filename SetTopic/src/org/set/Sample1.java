package org.set;

public class Sample1  {
	  private String username;
	  private String password;
	  public static int a;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if (username.equals("facebook")) {
		this.username = "Fraudraguvaran";}
		else	if (username.equals("twitter")) {
			this.username = "Fraudjeeva";}
		else	if (username.equals("Instagram")) {
			this.username = "Fraudsaral";}
		else if(username.equals("snapchat")) {
			this.username = "Fraudarock";}
			
		a=10;
			
		}
	
	public  String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.equals("facebook")) {
		this.password = "saranya007";}
		else if(password.equals("twitter")) {
			this.password = "sangeetha009";
		}else if(password.equals("instagram")) {
			this.password = "subha987";
		}else if(password.equals("snapchat")) {
			this.password = "Ramya007";
		
		}
		a=20;
		}
	
	public static void main(String[] args) {
		Sample1 s=new Sample1();
	System.out.println(s.a);
	s.setUsername("");
	System.out.println(s.a);
	
	s.setPassword("hjjvj");
	System.out.println(s.a);
	
	
	Sample1 s1=new Sample1();
	System.out.println(s1.a);
	s1.setUsername("fmj");
	System.out.println(s1.a);
	
	s1.setPassword("hmbm");
	System.out.println(s1.a);
	System.out.println(a);
	System.out.println(a);
	
	
	
	
	}
	
	
	}


	
	 
	
	 
     		
		
	       
		
	
	 
	 
 
		
	
	
	 
	 
	 
