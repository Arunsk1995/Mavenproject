package org.lang;

public class LanguageInfo extends StateDetails{
     private void tamilLanguage() {
       System.out.println("I am studying Tamil for past 15 years");
	}
     private void hindiLanguage() {
     System.out.println("I am studying Hindi for past 10 years");
	}
     private void englishLanguage() {
      System.out.println("I am studying English for past 6 years ");
	}
     public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.englishLanguage();
		l.hindiLanguage();
		l.tamilLanguage();
		l.northIndia();l.southIndia();
	}
}
