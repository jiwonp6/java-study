package ch12_accessModifier.ex1.com.school.management;
// #11 접근제한자 (2024-02-20)
public class Student {
    /* 필드 : 데이터 */
    private String name;
    private String studentId;

    /* 생성자 */
    public void student (){ }

    /* 메소드 */
    // getter
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    //  setter
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
