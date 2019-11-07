package com.chuang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean hasLength = StringUtil.hasLength("");
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		boolean text = StringUtil.hasText("");
		System.out.println(text);
	}

	@Test
	public void testRandomChineseStringInt() {
		String chineseString = StringUtil.randomChineseString(3);
		System.out.println(chineseString);
	}

	@Test
	public void testRandomChineseString() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
