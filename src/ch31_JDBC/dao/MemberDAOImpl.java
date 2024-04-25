package ch31_JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO{
    // DAO 인터페이스 구현 객체
    // DAO 생성과 동시에 접근 객체 생성
    Connection conn;
    public MemberDAOImpl(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void insert(MemberDTO member) {
        String sql = "INSERT INTO members (id, name, email) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());
            pstmt.executeUpdate();
            System.out.println("회원가입 성공");
        } catch (SQLException e) {
            System.out.println("회원가입 실패");
            e.printStackTrace();
        }
    }

    @Override
    public MemberDTO getMemberById(String id) {
        MemberDTO memberDTO = null;
        String sql = "SELECT id, name, email FROM members WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                id = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                memberDTO = new MemberDTO(id, name, email);
            } else {
                System.out.println("일치하는 회원이 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memberDTO;
    }

    @Override
    public void update(MemberDTO member) {
        String sql = "UPDATE members SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getId());
            pstmt.executeUpdate();
            System.out.println("회원 정보 수정 성공");
        } catch (SQLException e) {
            System.out.println("회원 정보 수정 실패");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM members WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            System.out.println("회원 탈퇴 성공");
        } catch (SQLException e) {
            System.out.println("회원 탈퇴 실패");
            e.printStackTrace();
        }
    }

    @Override
    public List<MemberDTO> getAllMembers() {
        // 데이터를 전달할 객체 리스트 (빈 컬렉션) 생성
        List<MemberDTO> memberDTOList = new ArrayList<>();
        String sql = "SELECT id, name, email FROM members";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                MemberDTO memberDTO = new MemberDTO(id, name, email);
                memberDTOList.add(memberDTO);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memberDTOList;
    }
}
