package com.javaPractise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import java.io.*;


public class ReverseString1 {
	public static void main(String[] args) {
		String str = "123";

		System.out.println(reverse(str));
	}
	
	  public static String reverse(String in) { if (in == null) throw new
	  IllegalArgumentException("Null is not valid input");
	  
	  StringBuilder out = new StringBuilder();
	  
	  char[] chars = in.toCharArray();
	  
	  for (int i = chars.length - 1; i >= 0; i--) out.append(chars[i]);
	  
	  return out.toString(); }
	 
}
