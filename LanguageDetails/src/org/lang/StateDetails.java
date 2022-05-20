package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("I am from kerala");

	}
private void northIndia() {
	System.out.println("I am from UP");

}

public static void main(String[] args) {
	LanguageInfo lang = new LanguageInfo ();
	lang.englishLanguage();
	lang.tamilLanguage();
	lang.hindiLanguage();
	
          StateDetails sta = new StateDetails();
          sta.southIndia();
          sta.northIndia();
	
	
	
	
}











}
