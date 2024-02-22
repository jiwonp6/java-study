package ch14_singleton;
// #13 싱글톤 (2024-02-22)
public class SingletonMain {
    public static void main(String[] args) {
        // 일반적인 객체 생성 방법으로는 싱글톤 객체 생성 불가
        // Singleton singleton = new Singleton();

        // 싱글턴 타입의 객체 생성방법
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // getInstance 메소드를 2 번 이상 사용하더라도 같은 객체로 보장된다.
        if(instance1 == instance2){
            System.out.println("같은 객체");
        }else {
            System.out.println("다른 객체");
        }

        // 리소스 중복 사용을 방지하고, 데이터 일관성을 유지할 때
        // 데이터베이스 연결, 로깅, 설정 등 컴포넌트 관리에 유용하게 사용됨

    }
}
