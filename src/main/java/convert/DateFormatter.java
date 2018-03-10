package convert;



import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter  implements Formatter<Date> {

    private SimpleDateFormat dateFormat = new SimpleDateFormat();
    private String[] datePatterns = {
            "yyyy-MM-dd",
            "yyyy/MM/dd",
            "MM-dd-yyyy",
            "MM/dd/yyyy",
            "MM$dd!yyyy",

    };






    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        System.out.println(2);
        dateFormat.setLenient(false);
        for(String datePattern : datePatterns) {
            try {
                dateFormat.applyPattern(datePattern);
                return dateFormat.parse(text);
            } catch (ParseException e) {
                continue;
            }
        }
        return null;
    }

    @Override
    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}

