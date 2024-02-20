package ch12_accessModifier.a;
// #11 접근제한자 (2024-02-20)
public class Data {
    public int publicData;
    int defaultData;
    private int privateData;

    /* 접근제한자 종류별 메소드 */
    // public
    public void publicMethod(){
        System.out.println("Data.publicMethod");
    }
    
    // default
    void defaultMethod(){
        System.out.println("Data.defaultMethod");
    }
    
    // private
    private void privateMethod(){
        System.out.println("Data.privateMethod");
    }

    /* 내부에서 접근 시 */
    void innerAccess(){
        // 필드 접근 : 모두 접근 가능
        publicData = 1000;
        defaultData = 1000;
        privateData = 1000;
        
        // 메소드 호출 : 모두 호출 가능
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
