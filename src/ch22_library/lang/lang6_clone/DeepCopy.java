package ch22_library.lang.lang6_clone;

// 깊은 복사
public class DeepCopy implements Cloneable{
    int[] array;

    public DeepCopy(int[] array) {
        this.array = array;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepCopy cloned = (DeepCopy) super.clone();
        cloned.array = this.array.clone();
            // => 내부 필드의 참조값 (배열, 참조타입 등) 을 다시 한번 복사해야 됨.
        return cloned;
    }
}
