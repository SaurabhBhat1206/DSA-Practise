package JavaBridgeAssignment;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {
        List<EmployeeData> employees = new ArrayList<>();
        employees.add(new EmployeeData(1, "Alice Johnson", 30, 55000, "Software Engineer", "Female", "IT"));
        employees.add(new EmployeeData(2, "Bob Smith", 32, 65000, "Project Manager", "Male", "Operations"));
        employees.add(new EmployeeData(3, "Charlie Brown", 28, 45000, "Business Analyst", "Male", "Finance"));
        employees.add(new EmployeeData(4, "Diana Prince", 32, 70000, "HR Manager", "Female", "HR"));
        employees.add(new EmployeeData(5, "Ethan Hunt", 40, 80000, "Team Lead", "Male", "IT"));
        employees.add(new EmployeeData(6, "Fiona Clark", 29, 47000, "QA Engineer", "Female", "IT"));


        Optional<EmployeeData> highPaidEmployee = employees.stream().max(Comparator.comparingDouble(EmployeeData::getSalary));
        highPaidEmployee.ifPresent((emp)->System.out.println("Employee with Highest salary : "+emp));

        System.out.println("------------------------------------------------");

        Optional<EmployeeData> youngEmp = employees.stream().min(Comparator.comparingInt(EmployeeData::getAge));
        youngEmp.ifPresent((yEmp)->System.out.println("Youngest Employee is : "+yEmp));

        System.out.println("------------------------------------------------");

        Optional<EmployeeData> thirdMostEldest = employees.stream()
                .sorted(Comparator.comparingInt(EmployeeData::getAge).reversed()) // Sort by age in descending order
                .skip(2) // Skip the first two eldest employees
                .findFirst(); // Get the 3rd employee

        // Display the 3rd most eldest employee
        thirdMostEldest.ifPresent(employee ->
                System.out.println("3rd most eldest employee: " + employee));

        System.out.println("------------------------------------------------");

        Map<String, Double> departmentWiseExpenses = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeData::getDepartment,
                        Collectors.summingDouble(EmployeeData::getSalary)
                ));

        // Display the department-wise expenses
        departmentWiseExpenses.forEach((department, totalExpense) ->
                System.out.println("Department: " + department + ", Total Monthly Expense: " + totalExpense));

        System.out.println("------------------------------------------------");

        Map<String, Double> averageAgeByDesignation = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeData::getDesignation,
                        Collectors.averagingInt(EmployeeData::getAge)
                ));

        // Display the average age of employees designation-wise
        averageAgeByDesignation.forEach((designation, averageAge) ->
                System.out.println("Designation: " + designation + ", Average Age: " + averageAge));

        System.out.println("------------------------------------------------");

        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeData::getGender,
                        Collectors.counting()
                ));

        // Display the count of males and females
        genderCount.forEach((gender, count) ->
                System.out.println("Gender: " + gender + ", Count: " + count));

    }
}
