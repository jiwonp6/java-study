package ch24_generic.ex1;

public class Pair<K, V> {
    // 필드
    K key;
    V value;

    // 생성자
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // 게터
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
