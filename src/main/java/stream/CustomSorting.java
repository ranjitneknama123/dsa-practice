package stream;

import java.util.Comparator;
import java.util.List;

public class CustomSorting {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 60000),
                new Employee(3, "Bob", 55000)
        );

        // Natural/ascending order sorting based on salary
        System.out.println("Employees sorted by salary in ascending order:");

        employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))

                .forEach(System.out::println);

        System.out.println("Employees sorted by salary in descending order:");

        employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

        // Sorting based on name in ascending order
        System.out.println("Employees sorted by name in ascending order:");

        /*employees.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);*/

        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        //Sort in descending order by name
        System.out.println("Employees sorted by name in descending order:");
        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

        // 2nd way for descending
        System.out.println("Employees sorted by name in descending order (2nd way):");
        employees.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);


    }
}
