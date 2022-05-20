
public class Desktop implements Software, Hardware {

	@Override
	public void hardwareResourses() {
                System.out.println("Input output port");
                this.softwareResourses();
	}

	@Override
	public void softwareResourses() {
                 System.out.println("Data Analysis");		
	}
public static void main(String[] args) {
	   Desktop d = new Desktop();
	   d.hardwareResourses();
}
}
