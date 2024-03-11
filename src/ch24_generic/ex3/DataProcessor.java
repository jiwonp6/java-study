package ch24_generic.ex3;

public interface DataProcessor<T> {
    public T processData(T element);
}
