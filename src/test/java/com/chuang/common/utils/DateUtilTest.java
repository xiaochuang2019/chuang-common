package com.chuang.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		Calendar c=Calendar.getInstance();
		c.set(2018, 7, 10);
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String string = fmt.format(date);
		System.out.println(string);
	}

	@Test
	public void testGetDateByFullMonth() {
		Calendar c=Calendar.getInstance();
		c.set(2019, 1, 10);
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String string = fmt.format(date);
		System.out.println(string);
	}

}
