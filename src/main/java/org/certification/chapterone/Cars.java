public class Cars{
	private static void drive(){
		{
			System.out.println("zoom");
		}
		System.out.println("fast");
	}
	 { System.out.println("faster Non static bloc, this will be executed any time when an object is created"); }
	static { System.out.println("faster Static bloc, this will be executed any time when the class is called"); }
	
	public static void main(String... unused){
		drive();
		drive();
	}
}