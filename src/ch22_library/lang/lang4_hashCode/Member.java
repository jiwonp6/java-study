package ch22_library.lang.lang4_hashCode;

import java.util.Objects;

public class Member {
        private String name;
        private int age;

    public Member(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode () {
            // 임의의 해시 정수 생성
            return ((age * 11) + name.hashCode());  // 이렇게 만들 필요 없음.....
        }

        @Override
        public boolean equals (Object o){   // equals 메소드와 일관성을 가져야 함
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Member member = (Member) o;
            return age == member.age && Objects.equals(name, member.name);
        }
    }


