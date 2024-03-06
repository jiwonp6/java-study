package ch22_library.ex.ex2;

import java.util.Objects;

public class Click {
    // 필드
    private double x;
    private double y;
    private int timeStamp;

    // 생성자
    public Click(double x, double y, int timeStamp) {
        this.x = x;
        this.y = y;
        this.timeStamp = timeStamp;
    }

    // 메소드
//    @Override
//    public boolean equals(Object obj) {
//        if (x == ((Click) obj).x && y == ((Click) obj).y){
//            return true;
//        }
//        return false;
//    }
    
    @Override
    public boolean equals(Object o) {   // 마법사 사용
        if (this == o) return true;     // 참조값 같은지 비교 => true
        // null 인 경우, 타입이 다른 경우 false
        if (o == null || getClass() != o.getClass()) return false;
        // 다운캐스팅하여 해당 필드값 비교 => true or false
        Click click = (Click) o;
        return Double.compare(x, click.x) == 0 && Double.compare(y, click.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
