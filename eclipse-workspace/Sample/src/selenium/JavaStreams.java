package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreams {
	@Test
	public void Regular() {
		List<String> names = Arrays.asList("Ram", "Shyam", "Adam", "Alex", "Niya", "Aliyaz");
		List<String> names1 = Arrays.asList("Alex", "Siya", "Abha");

		long namesCount = Stream.of("Ram", "Shyam", "Adam", "Alex", "Niya", "Aliya").filter(s -> s.startsWith("A"))
				.count(); // print names start with A
		System.out.println(namesCount);

		// names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));//print
		// names has letters more than 4
		// names.stream().map(s->s.toUpperCase()).forEach(s->
		// System.out.println(s));//print all in upper case

		Stream.concat(names.stream(), names1.stream()).forEach(s -> System.out.println(s));// join both array list
		Stream<String> list = Stream.concat(names.stream(), names1.stream());
		boolean st = list.anyMatch(s -> s.endsWith("z"));
		System.out.println("print end wit z" + st);
		Assert.assertFalse(st);

	}
	@Test
	public void CollectStream() {
		
		List<Integer> values=Arrays.asList(2,5,5,7,3,1,2);
		System.out.println("hello");
		//System.out.println(values.stream().distinct());
		values.stream().distinct().forEach(s->System.out.println("numbers"+s));
		//values.stream().distinct().filter(s->s.);
		
		
		
		
	}

}
