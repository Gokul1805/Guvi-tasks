// Custom exceptions
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range (15-21)");
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name contains invalid characters");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}
class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new ArithmeticException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index (0-6): ");
        int index = sc.nextInt();
        try {
            System.out.println("Day: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a value between 0 and 6.");
        }
    }
}
import java.util.*;

public class StudentGrades {
    HashMap<String, Integer> students = new HashMap<>();

    public void addStudent(String name, int grade) {
        students.put(name, grade);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void displayStudent(String name) {
        if (students.containsKey(name)) {
            System.out.println(name + "'s grade: " + students.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }
}
import java.util.*;

public class IntegerStack {
    Stack<Integer> stack = new Stack<>();

    public void pushElement(int element) {
        stack.push(element);
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public void isEmpty() {
        System.out.println(stack.isEmpty() ? "Stack is empty" : "Stack is not empty");
    }
}
