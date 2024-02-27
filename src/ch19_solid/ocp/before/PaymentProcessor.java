package ch19_solid.ocp.before;

public class PaymentProcessor {
    // OCP (개방 폐쇄 원칙) 적용 전
    // 다양한 결제 방법을 갖는 결제 프로세서
    // 새로운 결제 방법이 추가될 때 확장에는 열리고, 수정에는 닫힐 수 있게 클래스 설계
    public void processPayment(String paymentType){
        if (paymentType.equals("creditCard")){
            System.out.println("신용카드 결제를 진행합니다.");
        }else if(paymentType.equals("kakaoPay")) {
            System.out.println("카카오페이 결제를 진행합니다.");
        }
        // 새로운 결제 방법이 추가되었을 때 => 해당 메서드 수정해야 한다.
        else if (paymentType.equals("naverPay")){
            System.out.println("네이버페이 결제를 진행합니다.");
        }
        else {
            System.out.println("기본 결제");
        }
    }
    
}
