package org.computers;

public class Computer extends Desktop {
        private void computeModel() {
      System.out.println("Lenova");
		}
        
        public static void main(String[] args) {
			Computer c = new Computer();
			c.computeModel();
			c.desktopSize();
			}
}
