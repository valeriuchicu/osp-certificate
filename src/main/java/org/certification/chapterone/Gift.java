interface Toy{String play();}

public class Gift {
	public static void main(String... unused){
		abstract class Robot{}
		class Transformer extends Robot implements Toy {
			public String name = "Giantrobot";
			
			public String play(){
				return "DinosaurRobot";
			}
		}
			Transformer prime = new Transformer() {
				public String play(){
					return name;
				}
			};
			//System.out.println(prime.play() + " " + name); // here is missing play 
	}
}
