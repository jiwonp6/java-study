package quiz.quiz4.q4;

public class StringDataProcessor implements DataProcessor<String>{
    @Override
    public String processData(String element) {
        return element.toUpperCase();
    }
}
