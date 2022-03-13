public class DemoString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "GOOD MORNING";
		System.out.println("Print First String:-" +m);
		System.out.println("Length First String:-" + m.length());
 
		String m1 = new String("Welcome Sir/Maam");
		System.out.println("Print Second String:-" +m1);
		m.concat(m1);
		System.out.println("CONCAT  First & Second String:-" +m);
		
		String m2 = m.concat(m1);
		System.out.println("CONCAT  First & Second String:-" +m2);
	}

}
