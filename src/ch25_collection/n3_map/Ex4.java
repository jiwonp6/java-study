package ch25_collection.n3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex4 {
    /*
        <회사 직원 관리 시스템>

        [목적]
        회사의 직원 정보를 관리하는 간단한 시스템을 구현합니다.
        이 시스템은 직원 정보를 키로, 부서를 Map을 사용하여 직원들의 정보를 저장하고 관리합니다.
        사용자 정의 타입 Employee를 만들어 Map에 사용하고, 여러 직원 정보를 추가, 조회, 삭제하는 기능을 구현합니다.

        [요구 사항]
        [Employee 클래스 정의]
        필드:
        직원 ID(String id), 이름(String name), 부서(String department)
        생성자:
        직원 ID, 이름, 부서를 매개변수로 받아 초기화
        equals()와 hashCode() 메서드: 직원 ID를 기준으로 오버라이드

        [직원 정보 관리]
        직원 정보를 추가, 조회, 삭제하는 기능을 구현합니다.
        모든 직원의 정보를 출력하는 기능을 구현합니다.

        [예시 데이터]
        직원1: ID "001", 이름 "Alice", 부서 "개발"
        직원2: ID "002", 이름 "Bob", 부서 "디자인"
        직원3: ID "003", 이름 "Charlie", 부서 "마케팅"
     */
    static class Employee {
        // 필드
        private String id;
        private String name;

        // 생성자
        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
        }

        // 게터
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        // 메소드
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(id, employee.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
    public static void main(String[] args) {
        HashMap<Employee, String> employeeMap = new HashMap<>();

        // 직원 추가
        employeeMap.put(new Employee("001", "Alice"), "마케팅");
        employeeMap.put(new Employee("002", "Bob"), "디자인");
        employeeMap.put(new Employee("003", "Charlie"), "마케팅");
        employeeMap.put(new Employee("001", "Alice"), "개발");
        employeeMap.put(new Employee("001", "Damon"), "개발");    // 키가 같은 경우 -> 추가 X

        // 직원 조회
        int i = 0;
        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            i++;
            System.out.println(
                    "직원" + i + ": ID \"" + entry.getKey().getId()
                    + "\", 이름 \"" + entry.getKey().getName()
                    + "\", 부서 \"" + entry.getValue() + "\""
                    );
        }

        // 직원 삭제
        employeeMap.remove(new Employee("001", "Alice"));

        // 직원 조회
        System.out.println("\n< 직원 삭제 후 >");
        i = 0;
        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            i++;
            System.out.println(
                    "직원" + i + ": ID \"" + entry.getKey().getId()
                    + "\", 이름 \"" + entry.getKey().getName()
                    + "\", 부서 \"" + entry.getValue() + "\""
                    );
        }
    }
}
