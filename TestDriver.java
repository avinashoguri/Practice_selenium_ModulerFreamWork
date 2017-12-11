package calculatorTest;

public class TestDriver extends TestManager {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		TestDriver td=new TestDriver();
		
		td.launchBrowser();
		System.out.println(td.accApp());
		System.out.println(td.sum());
		System.out.println(td.division());
		System.out.println(td.percent());
		System.out.println(td.multiplication());
		System.out.println(td.subtraction());
		td.close();
		

	}

}
