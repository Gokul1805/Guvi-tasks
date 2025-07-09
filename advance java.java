1. Convert a list of Strings to uppercase using map() method
import java.util.stream.Stream;

public class UpperCaseConversion {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("abc", "d", "ef");
        names.map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
2. Check if strings in the list are empty or not, and print non-empty strings
import java.util.Arrays;
import java.util.List;

public class FilterNonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        strings.stream()
               .filter(s -> !s.isEmpty())
               .forEach(System.out::println);
    }
}
3. Filter students whose names start with "A" using List, lambda, and Stream API
import java.util.Arrays;
import java.util.List;

public class FilterStudents {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Ankit", "Ravi", "Arjun", "Sita", "Amit", "John", "Ajay", "Neha");

        students.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
4. App to calculate age using java.time.LocalDate
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " 
                           + age.getMonths() + " months, and " 
                           + age.getDays() + " days.");
    }
}
