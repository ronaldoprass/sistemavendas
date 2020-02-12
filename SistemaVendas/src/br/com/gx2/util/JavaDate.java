package br.com.gx2.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDate {

	public static java.sql.Date getCurrentDate() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}
	
	public static String getString(Date date) {
		   return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date);
	}
	
	public static Date getDate(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		java.util.Date dateFormat = sdf.parse(date);   
		return  dateFormat;
	}
	
	public static java.sql.Date getDateParser(Date date) throws ParseException {
		String dataString = getString(date); 
        DateFormat fmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        java.sql.Date data = new java.sql.Date(fmt.parse(dataString).getTime());
		return data;
	}
	
	
}
