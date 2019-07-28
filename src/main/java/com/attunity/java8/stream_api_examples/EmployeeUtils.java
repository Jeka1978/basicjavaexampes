package com.attunity.java8.stream_api_examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.time.DayOfWeek.FRIDAY;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtils {

    public static Map<Seniority, List<Employee>> bySeniority(List<Employee> employees) {
        return null;
//         employees.stream()
//                .collect(groupingBy(employee -> findBySalary(employee.getSalary()),
//                        Collectors.minBy(Comparator.comparingInt(Employee::getSalary)))
//                );
    }


    public static Map<String, Integer> name2Salary(List<Employee> employees) {
        return employees.stream().collect(
                Collectors.toMap(Employee::getName, Employee::getSalary, (salary1, salary2) -> 1000));

    }

    public static int totalSalaries(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary).sum();
      /*  Optional<Integer> optional = employees.stream()
                .map(Employee::getSalary)
                .reduce(Integer::sum);*/

    }


    public static void main(String[] args) {

        handleBlackFridays(1980,2000);
    }


    public static void handleBlackFridays(int start, int end) {
        LocalDate startDate = LocalDate.of(start, 1, 13);
        LocalDate endDate = LocalDate.of(end, 12, 14);
        Map<Integer, Long> map = Stream.iterate(startDate, localDate -> localDate.plusMonths(1))
                .limit(ChronoUnit.MONTHS.between(startDate, endDate))
                .filter(localDate -> localDate.getDayOfWeek() == FRIDAY)
                .collect(groupingBy(localDate -> localDate.getYear(), Collectors.counting()));

       map.entrySet().stream()
               .sorted((o1, o2) -> (int) (o2.getValue()-o1.getValue()))
               .forEach(System.out::println);
    }




}


