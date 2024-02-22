package ch16_inheritance.inheritance3;
// #15 상속 (2024-02-22)
public class Inheritance3 {
    public static void main(String[] args) {
        // Super Class
        CellPhone cellPhone = new CellPhone();
        String color = cellPhone.color;
        String model = cellPhone.model;
        cellPhone.bell();

        // Sub Class : Super Class + 추가 필드 + 추가 기능
        DmbCellPhone dmbCellPhone = new DmbCellPhone();
        String color1 = dmbCellPhone.color;
        int channel = dmbCellPhone.channel;
        dmbCellPhone.bell();
        dmbCellPhone.turnOnDmb();
    }
}
