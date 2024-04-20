package com.crac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		  Pattern pattern = Pattern.compile("ab");
	        
	        Matcher matcher = pattern.matcher("abbbabbcbdab");
	        
	        while(matcher.find()) {
	            System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
	        }
	        

	    }

	


	}


