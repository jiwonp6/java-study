package ch26_lambda.function.ex_consturctorRef;

public class Member {
    private String id;
    private String name;

    // 생성자
    public Member(String id) {
        this.id = id;
        System.out.println("Member " + id + " 객체 생성");
    }
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member " + id + ", " + name + " 객체 생성");
    }
}
