
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class LambdaExp {

	public static void main(String[] args) {
		LambdaExp lpExp= new LambdaExp();
		//lpExp.streamFilter();
		//lpExp.printNames();
		//lpExp.streamMap();
		//lpExp.addStream();
		lpExp.uniqueNo();
		
	}
		// TODO Auto-generated method stub
		public void nrmlMethod() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Rama");
		names.add("Sita");
		names.add("Gita");
		int count = 0;
		for (String i : names) {
			System.out.println(i);
			if (i.startsWith("R")) {
				count++;
			}
			

		}
		System.out.println(count);
	}
public void streamFilter() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Ram");
	names.add("Shyam");
	names.add("Rama");
	names.add("Sita");
	names.add("Gita");
	// no life of intermediate op if there is no terminal op
	// terminal op will only execute if intermediate op (filter)returns true
	Long count= names.stream().filter(s->s.startsWith("R")).count();
	System.out.println(count);
	//how to create stream directly
//	long  ct= Stream.of("Ram", "Shyam").filter(s->
//	{
//		 s.startsWith("R");
//		 return true;
//	}).count();
//	System.out.println(ct);
}
//print names having length greater than 4
public void printNames() {
	Stream.of("Ram", "Shyam", "Shiva", "Som", "Gannu").filter(s->s.length()>4).limit(1).forEach(s-> System.out.println(s));
	Stream.of("Ram", "Shyam", "Shiva", "Som", "Gannu").filter(s->s.length()>4).forEach(s-> System.out.println(s));
}
public void streamMap() {
	// print name whose last letter ends with 'm' to uppercase
	Stream.of("Ram", "Shyam", "Shiva", "Som", "Gannu").filter(s->s.endsWith("m")).sorted()
	.map(s-> s.toUpperCase())
	.forEach(s-> System.out.println(s));
}
public void addStream() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Romy");
	names.add("Shyama");
	ArrayList<String> names1 = new ArrayList<String>();
	names.add("Raju");
	names.add("Shyamal");
	Stream <String> newStream = Stream.concat(names.stream(), names1.stream());
	//newStream.sorted().forEach(s-> System.out.println(s));
	boolean flag= newStream.anyMatch(s-> s.equalsIgnoreCase("rajuuu"));
	Assert.assertTrue(flag);
	//System.out.println(flag);
}
public void streamCollect() {
	List<String> lp= Stream.of("Ram", "Shyam", "Shiva", "Som", "Gannu").filter(s->s.endsWith("m")).sorted()
	.map(s-> s.toUpperCase()).collect(Collectors.toList());
	System.out.println(lp.get(0));
	
}
public void uniqueNo() {
	
	List<Integer> values= Arrays.asList(3,2,2,7 ,5,1,9,7);
	values.stream().distinct().forEach(s-> System.out.println(s));
	List <Integer> lp= values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(lp.get(2));
}
}
