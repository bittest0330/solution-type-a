package problem02;

public class SmartPhone extends MusicPhone {
	
	public String runApp() {
		 System.out.println("앱실행");
		 return null;
	}
	
	@Override
	public void execute( String function ) {
		if (function.equals("음악")) {
			System.out.println("스트리밍");
			return;
		}
		else if (function.equals("앱")) {
			runApp();
			return;
		}
		
		super.execute(function);
	} 
	
	
}