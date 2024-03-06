package ch22_library.lang.lang9_classClass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ClassClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // Class 클래스
            // : 클래스에 대한 메타 데이터, 다양한 데이터를 조회하고, 조작, 관리
        // <Class 객체 얻는 방법>
        // 1. 클래스 이름.class
        Class<String> stringClass = String.class;

        // 2. Class.forName("패키지를 포함한 정식 클래스 이름");
        Class<?> strClass = Class.forName("java.lang.String");

        // 3. 참조 변수.getClass(); <--- 객체로 부터 얻기
        String str = "문자열";
        Class<? extends String> aClass = str.getClass();

        // 클래스 전체 이름 반환
        String className = stringClass.getName();
        System.out.println("클래스 이름 : " + className);
        // 부모 클래스 및 이름 반환 (메서드 체이닝 기법)
        String parentsName = stringClass.getSuperclass().getName();
        System.out.println("부모클래스 이름 : " + parentsName);

        // 일반적이지 않은 클래스의 인스턴스 생성하기
        String newInstance = stringClass.newInstance();

        // 클래스에 선언된 모든 메소드를 배열로 리턴
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        // 해당 클래스의 모든 메소드 시그니처 확인
        System.out.println("해당 클래스의 모든 메소드 시그니처 확인");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        // 클래스의 모든 필드 반환
        Field[] fields = stringClass.getDeclaredFields();
        // 필드 정보 확인
        System.out.println("필드 정보 확인");
        for (Field field : fields) {
            System.out.println(field);
        }

        // 동적 객체 생성 및 메소드 호출 (리플렉션 활용)
        Class<?> arrayListClass = Class.forName("java.util.ArrayList");
        // 일반적인 생성방법
        ArrayList<Object> arrayList = new ArrayList<>();
        // 리플렉션을 통한 동적 생성
        Object arrList = arrayListClass.newInstance();

        // 메소드 호출
        arrayList.add("a");
        // arrList.add("a"); <--- 일반적인 방법으로는 호출불가
        Method addMethod = arrayListClass.getMethod("add", Object.class);   // 동적 호출 방법 사용
        addMethod.invoke(arrList, "add");   // 메소드를 Class 리플렉션(Object)에서 뽑아낸 Method 리플렉션(addMethod)에서 강제로 호출

        /*
            <Reflection 주의사항>
            프레임워크를 새로 개발하거나, 컴파일 시점이 아닌 런타임에서 클래스와 상호작용할 때 매우 유용하게 사용할 수 있다.
            그러나, 리플렉션을 통한 호출은 일반 호출보다 성능이 저하된다.
            또한, 보안에 취약하다.
            코드 가독성과 디버그 사용이 나쁘다.
         */

    }
}
