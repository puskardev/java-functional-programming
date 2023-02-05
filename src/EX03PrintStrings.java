import java.util.Arrays;
import java.util.List;

public class EX03PrintStrings {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Calculus", "Physics", "Chemistry", "Algebra", "Computer Science", "Stats", "Health Science");
        printCourses(courses);
        printScienceCourses(courses);
        printCoursesWith7letters(courses);
    }
    private static void printCourses(List<String> courses) {
        System.out.println("All courses:");
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printScienceCourses(List<String> courses) {
        System.out.println("Science courses:");
        courses.stream()
                .filter(course -> course.contains("Science"))
                .forEach(System.out::println);
    }

    private static void printCoursesWith7letters(List<String> courses) {
        System.out.println("7 letter courses:");
        courses.stream()
                .filter(course -> course.length() == 7)
                .forEach(System.out::println);
    }
}
