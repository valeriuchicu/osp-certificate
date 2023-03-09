import java.util.stream.Stream;

public class StreamTest{
	
	public static void main(String... unused){
		var stream = Stream.of("base", "ball");
		
	//	stream.mapToObject(s -> s.length()).forEach(System.out::println);  // mapToObject does not exists !!!  there is a similarly named mapToObj() method on IntStream
		
		stream.map(s -> s.length()).forEach(System.out::println);

	}
}