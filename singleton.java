package singleton;

public class singleton {
	
	private static singleton instance;
	
	private singleton() {
		
	}
	
	public static synchronized singleton getInstance() {
		
		if( singleton.instance == null ){
			singleton.instance = new singleton();
			System.out.println("Neue Instanz erstellt");
		}
		
		return singleton.instance;
	}
	
	public void printSingleton(){
		System.out.println("Bestehende Instanz");
	}
}
