package ch24_generic.ex3;

public class StringDataProcessor implements DataProcessor<String> {
    @Override
    public String processData(String element) {
        return element.toUpperCase();
    }
}
