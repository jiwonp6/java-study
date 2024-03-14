package ch25_collection.n1_list.ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    // Composition : 필드로 데이터(친구 클래스 리스트)를 가짐
    private List<Friend> friendsList = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    // 삽입
    public void addFriend() {
        System.out.print("친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        String email = scanner.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        String phoneNumber = scanner.nextLine();

        friendsList.add(new Friend(name, email, phoneNumber));
        System.out.println("주소록에 친구가 추가되었습니다.");
    }

    // 삭제
    public void deleteFriend() {
        System.out.print("삭제하고자 하는 친구의 이름을 입력하세요 : ");
        String deleteName = scanner.nextLine();
        int deleteFriend = 0;
        Iterator<Friend> iterator = friendsList.iterator();
        while (iterator.hasNext()){
            Friend friend = iterator.next();
            if (friend.getName().equals(deleteName)){
                iterator.remove();
                deleteFriend++;
            }
        }
        for (int i = 0; i < friendsList.size(); i++) {

        }
        if (deleteFriend != 0){
            System.out.println("친구 목록에서 " + deleteFriend + "명 삭제되었습니다.");
        } else {
            System.out.println("일치하는 친구가 없습니다.");
        }
    }

    // 조회
    public void searchFriend() {
        System.out.print("찾고자 하는 친구의 이름을 입력하세요 : ");
        boolean searchFriend = false;
        String searchName = scanner.nextLine();
        for (int i = 0; i < friendsList.size(); i++) {
            if (friendsList.get(i).getName().equals(searchName)){
                System.out.println(friendsList.get(i).toString());
                searchFriend = true;
            }
        }
        if (!searchFriend){
            System.out.println("일치하는 친구가 없습니다.");
        }
    }

    // 출력
    public void printAllFriends() {
        System.out.println("<친구 주소록 출력>");
        if (friendsList.isEmpty()){
            System.out.println("주소록에 친구가 없습니다.");
        }
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.println(friendsList.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while (true) {
            System.out.println("""
                    
                    1. 친구 추가
                    2. 친구 삭제
                    3. 친구 검색
                    4. 주소록 출력
                    5. 종료
                    선택>
                    """);
            int select = scanner.nextInt();
            switch (select){
                case 1:
                    addressBook.addFriend();
                    break;
                case 2:
                    addressBook.deleteFriend();
                    break;
                case 3:
                    addressBook.searchFriend();
                    break;
                case 4:
                    addressBook.printAllFriends();
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
