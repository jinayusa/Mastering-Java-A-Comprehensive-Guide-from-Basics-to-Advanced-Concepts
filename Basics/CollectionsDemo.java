//Explore the most commonly used collections in Java like Lists, Sets, and Maps.
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("John");

        Set<String> uniqueNames = new HashSet<>(names);
        Map<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("James", 30);
        nameAgeMap.put("John", 25);

        System.out.println("Names: " + names);
        System.out.println("Unique Names: " + uniqueNames);
        System.out.println("Name-Age Map: " + nameAgeMap);
    }
}
