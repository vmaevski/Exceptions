package HW_S03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatConverter {
    public static void strToDate(String str) {
        String s = str;
        try {
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd.MM.yyyy");
            Date dateDate = format.parse(s);
            System.out.println("Дата рождения: " + dateDate);

        } catch (WrongFormatException e) {
            System.out.println("WrongFormatException");
        } catch (ParseException e) {
            System.out.println("ParseException");
        }
    }
}
