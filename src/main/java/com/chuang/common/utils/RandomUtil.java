package com.chuang.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
		public static int random(int min, int max){
			Random random=new Random();
			int nextInt = random.nextInt(max-min+1)+min;
			return nextInt;
		}
		//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
		public static int[] subRandom (int min, int max, int subs){
			/**
			 * 创建set集合存放不同的数据
			 */
			Set<Integer> set=new HashSet<>();
			/**
			 * set集合长度满足subs长度停止存放
			 */
			while (set.size()!=subs) {
				set.add(random(min, max));
			}
			/**
			 * 创建数组用来存放应该返回的值
			 */
			int[] num=new int[subs];
			int i=0;
			/**
			 * 将想要返回的数据存入数组
			 */
			for (Integer integer : set) {
				num[i]=integer;
				i++;
			}
			return num;
		}
		//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
		public static char randomCharacter (){
			/**
			 * 创建存在1-9,a-Z的字符
			 */
			String character="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
			/**
			 * 随机获得一个数字作为下标,用来获取一个随机的字符
			 */
			return	character.charAt(random(0,character.length()-1));
		}
		/**
		 * 
		 * @Title: randomNumber 
		 * @Description: 返回指定长度数字
		 * @param length
		 * @return
		 * @return: String
		 */
		public static String randomNumber (int length){
			//声明1-9,a-Z之间的符所有字符
			String str ="1234567890";
			String num="";
			for (int i = 0; i < length; i++) {
				num+=str.charAt(random(0, str.length()-1));
			}
			return num;
			
			
		}
		//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
		public static String randomString(int length){
			/**
			 * 创建空字符串用来拼接随机获取来的length个字符
			 */
			String charac="";
			/**
			 * 循环获取length个字符，并进行拼接
			 */
			for (int i = 0; i <length; i++) {
				charac+=randomCharacter();
			}
			/**
			 * 返回拼接后的字符串
			 */
			return charac;
		}
}
