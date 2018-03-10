package convert;

import org.springframework.core.convert.converter.Converter;
import java.text.ParseException; import java.text.SimpleDateFormat; import java.util.Date;
public class StringToDateConverter implements Converter<String, Date> {



    private String[] datePatterns = {
            "yyyy-MM-dd",
            "yyyy/MM/dd",
            "MM-dd-yyyy",
            "MM/dd/yyyy",
            "MM$dd!yyyy",
    };


    @Override
    public Date convert(String source) {
        System.out.println(1);
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        dateFormat.setLenient(false);
        for(String datePattern : datePatterns) {
            try {
                dateFormat.applyPattern(datePattern);
                return dateFormat.parse(source);
            } catch (ParseException e) {
                continue;
            }
        }
        return null;
    }
}