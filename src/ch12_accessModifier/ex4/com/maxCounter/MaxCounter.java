package ch12_accessModifier.ex4.com.maxCounter;
// #11 접근제한자 (2024-02-20)
public class MaxCounter {
    /* 필드 : 데이터 */
    private int count;
    private int max;

    /* 생성자 */
    public MaxCounter() {}

    /* 메소드 */
    // getter
    public int getCount() {
        return count;
    }
    // setter
    public void setMax(int max) {
        this.max = max;
    }

    public int increment(){
        if (count < max){
            count++;
            System.out.println("숫자 증가 : " + count);
        }else {
            System.out.println("최대값을 초과할 수 없습니다. (" + count + ")");
        }
        return count;
    }

}
