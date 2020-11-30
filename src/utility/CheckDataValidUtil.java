package utility;

import java.time.format.DateTimeParseException;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckDataValidUtil {
	
    /**
     * 
     * @param s_date
     * @param formatter
     * @return
     */
    public static boolean isValidDate(final String s_date, final String formatter) {

        boolean isValid = false;

        try {
            String a_date [] = s_date.split("/");
			if (isYearInRange(a_date[2]) && isMonthInRange(a_date[1]) && isDayInRangePerMonthPerYear (a_date[0], a_date[1], a_date[2])) {
				isValid = true;
			}
		} catch (DateTimeParseException e) {
			isValid = false;
            e.printStackTrace();
        }
		System.out.println("-------------------------------------------");
		System.out.println("isValidDate: " + isValid);
		System.out.println("-------------------------------------------");
        return isValid;
    }

    /**
     * check if year is between 1756 and 9999 
     * @param s_year
     * @return
     */
    protected static boolean isYearInRange (String s_year) {
    	
    	boolean isInRange = false;
    	try { 
	    	Integer i_year = Integer.valueOf(s_year);
		    if(ValueRange.of(1753, 9999).isValidIntValue(i_year))
		    {
		    	isInRange = true;
		    }
    	} catch (Exception e) {
    		isInRange = false;
    		e.printStackTrace();
    	}
    	System.out.println("-------------------------------------------");
 
		System.out.println("isYearInRange: " + isInRange);

	    return isInRange;
	}

    /**
     * check if month is between 1 and 12
     * @param s_month
     * @return
     */
    protected static boolean isMonthInRange (String s_month) {
    	
    	boolean isInRange = false;
    	
    	try { 
	    	Integer i_month = Integer.valueOf(s_month);
		    if(ValueRange.of(1, 12).isValidIntValue(i_month)) {
		    	isInRange = true;
		    }
    	} catch (Exception e) {
    		isInRange = false;
    		e.printStackTrace();
    	}
		System.out.println("-------------------------------------------"); 
		System.out.println("isMonthInRange: " + isInRange);

	    return isInRange;
	}

    /**
     * check if year is a leap year
     * @param s_year
     * @return
     */
    protected static boolean isLeapYear (String s_year) {
    	
    	boolean isLeap = false;
    	
    	try {
	    	Integer year = Integer.valueOf(s_year);
		
		    if(year % 4 == 0)
		    {
		        if( year % 100 == 0) {
		            if ( year % 400 == 0) {
		                isLeap = true;
		            } else {
		               isLeap = false;
		            }
		        } else {
		            isLeap = true;
		        }
		    }
		    else {
		        isLeap = false;
		    }
    	} catch (Exception e) {
    		isLeap = false;
    		e.printStackTrace();
		}
    	System.out.println("-------------------------------------------");
    	System.out.println("isLeapYear: " + isLeap);
	    return isLeap;
    }
    
    /**
     * check if day is correct per month, year and leap 
     * @param s_day
     * @param s_month
     * @param isLeap
     * @return
     */
    protected static boolean isDayInRangePerMonthPerYear (String s_day, String s_month, String s_year) {

    	boolean isInRange = false;
    	boolean isLeapYear = isLeapYear(s_year);
    	
		List<Integer> al_31 = new ArrayList<Integer>(Arrays.asList(1,3,5,7,8,10,12));
		List<Integer> al_30=new ArrayList<Integer>(Arrays.asList(4,6,9,11));
		
    	try {
        	Integer i_day = Integer.valueOf(s_day);
        	Integer i_month = Integer.valueOf(s_month);

        	if(al_31.contains(i_month) && ValueRange.of(1, 31).isValidIntValue(i_day)) {
        		isInRange = true;
        	} else if(al_30.contains(i_month) && ValueRange.of(1, 30).isValidIntValue(i_day)) {
        		isInRange = true;
        	} else if(i_month == 2 && ValueRange.of(1, 28).isValidIntValue(i_day) && !isLeapYear) {
        		isInRange = true;
        	} else if(i_month == 2 && ValueRange.of(1, 29).isValidIntValue(i_day) && isLeapYear) {
        		isInRange = true;
        	} else {
        		isInRange = false;
        	}
        	
		} catch (Exception e) {
			isInRange = false;
			e.printStackTrace();
		}
		System.out.println("-------------------------------------------");
		System.out.println("isDayInRange: " + isInRange);

    	return isInRange;
    }
}
