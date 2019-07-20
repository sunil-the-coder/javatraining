import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		Stream<Integer> ints = Stream.of(1,2,3,4,5,6);
		ints.forEach(p->System.out.println(p));
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		numbers.stream().forEach(p->System.out.println(p));
		
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		Stream<String> filteredNames = memberNames.stream().filter(name -> !name.startsWith("S"));
		List<String> upperNames = filteredNames.map(n-> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperNames);
		
		//filteredNames.forEach(n-> System.out.println(n.toUpperCase()));
		
	}
}
