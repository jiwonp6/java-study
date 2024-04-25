package ch31_JDBC.dao;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    private static MemberDAO memberDAO;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        memberDAO = new MemberDAOImpl(DatabaseUtil.getConnection());
        while (true) {
            System.out.println("1. 회원가입 | 2. 회원조회 | 3. 정보수정 | 4. 회원탈퇴 | 5. 전체회원목록 | 6. 나가기 ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" :
                    insert();
                    break;
                case "2" :
                    getMemberById();
                    break;
                case "3" :
                    update();
                    break;
                case "4" :
                    delete();
                    break;
                case "5" :
                    list();
                    break;
                case "6" :
                    DatabaseUtil.close();
                    return;
            }
        }


    }

    private static void insert() {
        // 회원 가입
        System.out.println("[회원 생성]");
        System.out.print("id : ");
        String id = scanner.nextLine();
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("이메일 : ");
        String email = scanner.nextLine();
        // DTO 객체 생성
        MemberDTO member1 = new MemberDTO(id, name, email);
        // 데이터 접근은 DAO 에게 위임
        // insert
        memberDAO.insert(member1);
    }
    private static void getMemberById() {
        String id;
        System.out.print("id : ");
        id = scanner.nextLine();
        // getMemberById
        MemberDTO getMember1 = memberDAO.getMemberById(id);
        System.out.println("id: " + id + ", name: " + getMember1.getName() + ", email: " + getMember1.getEmail());
    }
    private static void update() {
        String id;
        String name;
        String email;
        System.out.print("변경하고자 하는 id : ");
        id = scanner.nextLine();
        System.out.print("변경할 이름 : ");
        name = scanner.nextLine();
        System.out.print("변경할 이메일 : ");
        email = scanner.nextLine();
        // update
        MemberDTO updateMember1 = new MemberDTO(id, name, email);
        memberDAO.update(updateMember1);
    }
    private static void delete() {
        String id;
        System.out.print("id : ");
        id = scanner.nextLine();
        // delete
        memberDAO.delete(id);
    }

    private static void list(){
        List<MemberDTO> allMembers = memberDAO.getAllMembers();
        for (MemberDTO member : allMembers) {
            System.out.println("id: " + member.getId() + ", name: " + member.getName() + ", email: " + member.getEmail());
        }
    }
}
