package ch19_solid.srp.after;

public class EmployeeRepository {
    // SRP(단일 책임 원칙) 적용 후
    // 데이터베이스에 관련된 하나의 책임만을 가짐
    // 데이터베이스에서 직원 정보를 저장하는 로직
    public void save(Employee employee){
        System.out.println("직원 정보 저장");
    }
}
