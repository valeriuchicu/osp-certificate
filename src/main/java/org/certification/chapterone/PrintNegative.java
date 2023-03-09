import java.util.*;
public class PrintNegative{

	public static void main(String... unused){
						
			List<Integer> list = new ArrayList<>();
			list.add(-5);
			list.add(0);
			list.add(5);
			list.removeIf(e -> e < 0);
			list.forEach(x -> System.out.println(x));
	}
}