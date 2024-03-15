package quiz.quiz4.q4;

public class NumberDataProcessor implements DataProcessor<Integer>{
    @Override
    public Integer processData(Integer element) {
        return element * 2;
    }
}
