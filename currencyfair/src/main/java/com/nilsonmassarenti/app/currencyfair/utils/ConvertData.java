package com.nilsonmassarenti.app.currencyfair.utils;

/**
 * This class is to convert all type of data
 * @author nilsonmassarenti - nilsonmassarenti@gmail.com
 * @version 0.1
 * Last update: 03-Mar-2015 12:20 am
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertData {

	/**
	 * This method to convert a Date
	 * 
	 * @param dateTime
	 *            Necessary a String in format of date
	 * @return Date Converted date
	 * @exception ParseException
	 */
	public Date convertDate(String dateTime) {
		SimpleDateFormat formatter = new SimpleDateFormat(
				"dd-MMM-yyyy HH:mm:ss");

		try {
			Date date = formatter.parse(dateTime);
			return date;

		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
