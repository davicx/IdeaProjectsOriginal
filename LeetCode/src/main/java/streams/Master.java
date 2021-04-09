package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Parralel Streams make multithreading easier
//Source -> Filter -> Sort -> Map -> Collect ->
//Source Collections, Lists, Sets, ints, longs, doubles, arrays, lines of a file
//Intermediate Operations: anyMatch(), distinct(), filter(), findFirst(), flatmap(), map(), skip(), sorted()
//Reduce: count(), max(), min(), reduce(), summaryStatistics()

public class Master {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Bilbo", 140));
        people.add(new Person("David", 100));
        people.add(new Person("sam", 90));
        people.add(new Person("Frodo", 120));


        //FILTER : All over 100
        //Filter Stream
        List<Person> hundredClub = people.stream().filter(person -> person.billions >= 100).collect(Collectors.toList());
        //System.out.println(hundredClub);

        //Sorted Stream (Sort Alphabetically)
        List<Person> sortedList = people.stream().sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
        //sortedList.forEach(person -> System.out.println(person.name));

        //Chain Streaming Methods
        List<Person> hundredSortedClub = people.stream()
                .filter(person -> person.billions >= 100)
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());
        //hundredSortedClub.forEach(person -> System.out.println(person.name + " " + person.billions));

        //Integer Stream
        /*
        IntStream.range(1, 10).forEach(System.out::print);

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(i -> System.out.println(i));
        System.out.println();

        //Print the Sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
        System.out.println();

         */

        //Strings
        /*
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);


        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(name -> System.out.println(name));
                //.forEach(System.out::println);

         */

        //Arrays
        /*
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        Arrays.stream(new int[] {2, 3, 4})
                .map(x -> x * 1)
                .average()
                .ifPresent(System.out::println);

         */
        //Stream From List
        List<String> peopleList = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        peopleList
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);


    }

    static class Person {
        String name;
        int billions;

        //Constructor
        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }
    }

    //Without a Filter
        /*
        ArrayList<Person> hundredClub = new ArrayList<Person>();
        for(Person p: people) {
            if(p.billions >= 100) {
                hundredClub.add(p);
            }
        }
         */

}

/*


public class JavaStreams {
	public static void main(String[] args) throws IOException {
		// 1. Integer Stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
		System.out.println();

		// 2. Integer Stream with skip
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));
		System.out.println();

		// 3. Integer Stream with sum
		System.out.println(
		IntStream
			.range(1, 5)
			.sum());
		System.out.println();

		// 4. Stream.of, sorted and findFirst
		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);

		// 5. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
		Arrays.stream(names)	// same as Stream.of(names)
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(System.out::println);

		// 6. average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map(x -> x * x)
			.average()
			.ifPresent(System.out::println);

		// 7. Stream from List, filter and print
		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		people
			.stream()
			.map(String::toLowerCase)
			.filter(x -> x.startsWith("a"))
			.forEach(System.out::println);

		// 8. Stream rows from text file, sort, filter, and print
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands
			.sorted()
			.filter(x -> x.length() > 13)
			.forEach(System.out::println);
		bands.close();

		// 9. Stream rows from text file and save to List
		List<String> bands2 = Files.lines(Paths.get("bands.txt"))
			.filter(x -> x.contains("jit"))
			.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println(x));

		// 10. Stream rows from CSV file and count
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int)rows1
			.map(x -> x.split(","))
            .filter(x -> x.length == 3)
			.count();
		System.out.println(rowCount + " rows.");
		rows1.close();

		// 11. Stream rows from CSV file, parse data from rows
		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
		rows2
			.map(x -> x.split(","))
            .filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
		rows2.close();

		// 12. Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3
			.map(x -> x.split(","))
            .filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(
                x -> x[0],
                x -> Integer.parseInt(x[1])));
		rows3.close();
		for (String key : map.keySet()) {
			System.out.println(key + "  " + map.get(key));
		}

		// 13. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8)
			.reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);

		// 14. Reduction - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
			.summaryStatistics();
		System.out.println(summary);
	}
}
 */
