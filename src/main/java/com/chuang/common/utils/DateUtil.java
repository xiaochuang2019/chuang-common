package com.chuang.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		/**
		 * 获取系统时间
		 */
		Calendar c=Calendar.getInstance();
		/**
		 * 存入传入时间
		 */
		c.setTime(src);
		c.set(Calendar.DAY_OF_MONTH, 1);//月份第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//0小时
		c.set(Calendar.MINUTE,0);//0分钟
		c.set(Calendar.SECOND, 0);//0秒
		/**
		 * 获取处理后的时间
		 */
		Date time = c.getTime();
		return time;
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		/**
		 * 获得系统时间
		 */
		Calendar c=Calendar.getInstance();
		/**
		 * 存入传入时间
		 */
		c.setTime(src);
		/**
		 * 当前月份+1
		 */
		c.add(Calendar.MONTH,1);
		/**
		 * 将时间变为当月第一天0小时0分0秒
		 */
		Date date = getDateByInitMonth(c.getTime());
		/**
		 * 存入改变后的时间
		 */
		c.setTime(date);
		/**
		 * 秒-1
		 */
		c.add(Calendar.SECOND,-1);
		/**
		 * 返回该月最后一天的最后一分最后一秒
		 */
		return c.getTime();
	}
}
