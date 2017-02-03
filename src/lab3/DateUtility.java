package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {

    public String getFormattedDate(Date orientationDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(orientationDate);
    }

}
