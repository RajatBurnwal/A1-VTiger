package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is an utility class which deals with Java related functionalities
 * @author rajat burnwal
 * @version 25.03.06
 */
public class JavaUtility {

	/**
	 * This is a generic method to generate random number for a given bound
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random random = new Random();
		int value = random.nextInt(bound);
		return value;
	}
	
	/**
	 * This is a generic method to fetch calendar details
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern)
	{
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(date);
		return value;
	}
}
