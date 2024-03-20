package ch27_stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12 {
    /*
        <직원들의 급여 집계하기>
        회사 직원들의 정보가 다음과 같이 주어져 있습니다.
        모든 직원의 총 급여와, 직책별 평균 급여를 계산하세요.

        - 모든 직원의 총 급여 계산하기
        - 직책별 평균 급여 계산하기

        출력예시
        ===
        총 급여: 26000
        Developer 평균 급여: 5500.0
        Manager 평균 급여: 7500.0
     */
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Developer", 5000),
            new Employee("Bob", "Developer", 6000),
            new Employee("Charlie", "Manager", 7000),
            new Employee("David", "Manager", 8000)
        );

        // 모든 직원의 총 급여 계산하기
        int sum = employees.stream()
                .mapToInt(employee -> employee.salary())
                .sum();
        System.out.println("총 급여: " + sum);

        // 직책별 평균 급여 계산하기
        Map<String, Double> positionAvgSalary
                = employees.stream()
                            .collect(Collectors.groupingBy(Employee::role,
                                     Collectors.averagingDouble(Employee::salary)));
        for (Map.Entry<String, Double> entry : positionAvgSalary.entrySet()) {
            System.out.println(entry.getKey() + " 평균 급여: " + entry.getValue());
        }

    }
}
record Employee(String name, String role, int salary) {}
