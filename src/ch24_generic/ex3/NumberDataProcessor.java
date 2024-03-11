package ch24_generic.ex3;

public class NumberDataProcessor implements DataProcessor<Integer> {
    @Override
    public Integer processData(Integer element) {
        return (element * 2);
    }
}
