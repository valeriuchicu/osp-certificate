package org.certification.chapterone;
import java.lang.*;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args){
		
		float value = 102.0f;
		
		var $num = (Integer)null;
		System.out.println("Hello World " + "the first time :)))))");
		System.out.println("Hello My Exam!!! Are you happy to see me?");
		System.out.println($num);
		System.out.println(value); 
		
		
				
			List<Integer> list = new ArrayList<>();
			list.add(-5);
			list.add(0);
			list.add(5);
			
			list.forEach(x -> System.out.println(x));
	}
}