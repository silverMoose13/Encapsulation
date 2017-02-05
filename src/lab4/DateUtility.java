package lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
    //It is not the job of the employee to format the date, The date utility
    //class will do this and the employee will instantiate it.
    
    public String getFormattedDate(Date orientationDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(orientationDate);
    }
}
