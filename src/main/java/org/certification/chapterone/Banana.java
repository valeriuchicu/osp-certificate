interface Fruit{
	public default char getColour(){
		return 'Z';
	}
}
interface Edible{
	public default char getColour(){
		return 'X';
	}
}

class NotEdible {
	
	public char getColour(){
		return 'N';
	}
}

// this is the case of diamond problem
public class Banana extends NotEdible implements Fruit, Edible {
	
	public char getColour(){
		return Edible.super.getColour();
	}
	public static void main(String... unused){
		var d = new Banana();
			System.out.println(d.getColour());
		System.out.println("Banana was constructed !!!");
	}
}