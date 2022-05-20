package org.college;

public class Hod implements Students,Staff {

	@Override
	public void leo() {
    System.out.println("Thermodynamics");	
    this.arock();
    this.arunkumar();
    this.jeeva();
    this.vijayanand();
	}

	@Override
	public void arunkumar() {
               System.out.println("Metrology");		
	}

	@Override
	public void vijayanand() {
        System.out.println("Total Quality management");		
	}

	@Override
	public void arun() {
                 System.out.println("Interested in Strenth of Material");	
                 
	}

	@Override
	public void jeeva() {
       System.out.println("Interested in Heat and Mass Trasfer");		
	}

	@Override
	public void arock() {
             System.out.println("Interested in TQM");		
	}

	@Override
	public void saral() {
       System.out.println("Interested in Design");		
	}
   public static void main(String[] args) {
	Hod h = new Hod();
	h.leo();

		
}
    
}
