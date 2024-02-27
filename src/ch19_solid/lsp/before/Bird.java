package ch19_solid.lsp.before;

public class Bird {
    // LSP (리스코프 치환 원칙) 적용 전
    public void fly(){
        System.out.println("새가 난다.");
    }
}
