//Leveraging the power of Java Streams for complex data manipulation.
import java.util.*;
import java.util.stream.*;

public class StreamsAPIExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jinay", "RZ", "MM", "PD", "GI");

        // Filter names that start with 'J' and convert to uppercase
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("J"))
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
