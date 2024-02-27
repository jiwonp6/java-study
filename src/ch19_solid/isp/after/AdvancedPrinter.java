package ch19_solid.isp.after;

public class AdvancedPrinter implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("프린트를 진행합니다.");
    }

    @Override
    public void scan() {
        System.out.println("스캔을 진행합니다.");
    }

    @Override
    public void fax() {
        System.out.println("팩스를 진행합니다.");
    }
}
