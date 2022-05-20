package org.india;

import org.tamilnadu.TamilNadu;

public class India extends TamilNadu{
  private India() {
    System.out.println("I know All three Languages"); 
    
    }
  public static void main(String[] args) {
	India t = new India();
	t.tamillanguage();
	t.malayalam();
	t.telugu();
    
}
}
