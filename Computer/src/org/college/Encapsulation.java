package org.college;

public class Encapsulation {
        private String username;
        private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			if(username.equals("facebook")) {
				
			
			this.username = "Jeevakumar007";
			}
			else if(username.equals("Istagram")) {
					
					
					this.username = "saralkumar007";
			}
				else if(username.equals("snapchat")) {
						
						
						this.username = "arockiya007";
				}
					else if(username.equals("twitter")) {
							
							
							this.username = "Ashikjerin";
					}
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
		if(password.equals("facebook")) {
			
		
		
			this.password = "1995jeeva";
		}else if(password.equals("Instagram")) {
			
		
		
			this.password = "1997saral";
		}else if (password.equals("snapchat")) {
			
		
		
			this.password = "1996arockiya";
        
}else if (password.equals("twitter")) {
	
	
	
	this.password = "1996Ashikjerin";}

		}
}
