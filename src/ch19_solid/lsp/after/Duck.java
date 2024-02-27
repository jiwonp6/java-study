package ch19_solid.lsp.after;

public class Duck extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("오리가 납니다.");
    }
}
