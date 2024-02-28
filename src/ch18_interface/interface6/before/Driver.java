package ch18_interface.interface6.before;

public class Driver {
    // 필드 - 차량이 추가 되면 코드가 변경되어야 한다.
    private Avante avante;
    private Sonata sonata;

    // 메소드

    // setter - 자동차를 설정
    public void setAvante(Avante avante) {
        this.avante = avante;
    }

    public void setSonata(Sonata sonata) {
        this.sonata = sonata;
    }

    // 운전
    public void drive(){
        if (avante != null){
            avante.onEnglish();
            avante.pressAccel();
            avante.pressBreak();
            avante.offEnglish();
        } else if (sonata != null){
            sonata.onEnglish();
            sonata.pressAccel();
            sonata.pressBreak();
            sonata.offEnglish();
        }
    }
}
