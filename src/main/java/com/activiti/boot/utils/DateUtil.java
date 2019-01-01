package com.activiti.boot.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.util.StringUtils;

public class DateUtil {
	private static final String DATE_TIME_PATTERN ="yyyy-MM-dd HH:mm:ss";
	private static final String MINUTE_PATTERN = "yyyy-MM-dd HH:mm";
	private static final String HOUR_PATTERN = "yyyy-MM-dd HH:mm:ss";
	private static final String DATE_PATTERN = "yyyy-MM-dd";
	private static final String MONTH_PATTERN = "yyyy-MM";
	private static final String YEAR_PATTERN = "yyyy";
	private static final String MINUTE_ONLY_PATTERN = "mm";
	private static final String HOUR_ONLY_PATTERN = "HH";
	
	/**
	 * 日期天数相加
	 * @param date
	 * @param days
	 * @param includeTime
	 * @return
	 * @throws ParseException
	 */
	public static Date dateAdd(Date date, int days, boolean includeTime) throws ParseException {
		if(date ==null) {
			date =new Date();
		}
		if(!includeTime) {
			SimpleDateFormat sdf= new SimpleDateFormat(DateUtil.DATE_TIME_PATTERN);
			date = sdf.parse(sdf.format(date));
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}
	
	/**
	 * 日期转为字符串
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String dateFormat(Date date,String pattern) {
		if(StringUtils.isEmpty(pattern)) {
			pattern = DateUtil.DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
}
