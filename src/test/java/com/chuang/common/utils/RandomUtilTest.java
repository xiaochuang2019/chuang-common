package com.chuang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void test() {
		for (int i = 0; i <10; i++) {
			int r = RandomUtil.random(1, 4);
			System.out.println(r);
		}
	}
	@Test
	public void test1() {
		int[] sr = RandomUtil.subRandom(1,8,3);
		for (int i : sr) {
			System.out.print(i+",");
		}
	}
	@Test
	public void test2() {
		for (int i = 0; i < 11; i++) {
			char c = RandomUtil.randomCharacter();
			System.out.println(c);
		}
	}
	@Test
	public void test3() {
		String string = RandomUtil.randomString(20);
		System.out.println(string);
	}
}
