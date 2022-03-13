public class DemoString2 {

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
		
		String m3 = "Hey";
		System.out.println("CONCAT  First & Second String:-" +m3);
		
		String m4 = "Mukul";
		System.out.println("CONCAT  First & Second String:-" +m4);
		
		if(m==m3) 
		{
			System.out.println("Print m = m3");
		}
		else
		{
			System.out.println("Print m =! m3");
		}
		
		System.out.println("m & m3 Are Equals " +(m.equals(m3)));
	}

}
