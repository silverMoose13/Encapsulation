package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {

    //this job is not the employees so this method was moved into a class of its own
    public String getFormattedDate(Date orientationDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(orientationDate);
    }

}
