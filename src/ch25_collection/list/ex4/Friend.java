package ch25_collection.list.ex4;

public class Friend {
    // 필드
    private String name;
    private String email;
    private String phoneNumber;

    // 생성자
    public Friend(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // 오버라이드
    @Override
    public String toString() {
        return "이름 : " + name + ", 이메일 : " + email + ", 전화번호 : " + phoneNumber;
    }

    // 게터
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
