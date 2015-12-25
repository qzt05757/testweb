package com.nec.jp.ce.m.hayakawa.rest.utils;

import java.util.Iterator;


public class BasicUtils {
	
	public static int toInt(String str, int dv) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException ex) {
			return dv;
		}
	}
	
	public static <T> T find(Iterable<?> col, Class<T> type) {
		if(col == null) {
			return null;
		}
	}
}
