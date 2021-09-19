package demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) throws ParseException {
        System.out.println(System.currentTimeMillis());
        Date date1 = new Date();
        System.out.println(date1);
        Date date2 = new Date(16164616336L);
        System.out.println(date2);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date1));
        System.out.println(sdf.parse("2020-08-30 21:32:33"));
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
    }
}
