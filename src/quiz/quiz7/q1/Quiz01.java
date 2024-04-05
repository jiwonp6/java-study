package quiz.quiz7.q1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Quiz01 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );
        // 목표 1: 모든 직원의 총 급여 계산하기
        int totSal = employees.stream()
                                .mapToInt(Employee::salary)
                                .sum();
        System.out.println("총급여: " + totSal);

        // 목표 2: 직책별 평균 급여 계산하기
        Map<String, Double> positionAvgSal = employees.stream()
                .collect(Collectors.groupingBy(Employee::role, Collectors.averagingDouble(Employee::salary
                )));
        for (Map.Entry<String, Double> entry : positionAvgSal.entrySet()) {
            System.out.println(entry.getKey() + " 평균급여: " + entry.getValue());
        }
    }
    record Employee(String name, String role, int salary) {}
}


