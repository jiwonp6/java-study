package quiz.quiz5.q5;

import javax.swing.text.DateFormatter;
import java.util.function.Function;

public class Quiz05 {
    public static void main(String[] args) {
        String strDate = "20240320";
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String strDate) {
                String formattedDate = strDate.substring(0, 4) + "-" + strDate.substring(4, 6) + "-" +strDate.substring(6, 8);
                return formattedDate;
            }
        };

        System.out.println(function.apply(strDate));
    }
}
