package com.tej.generalproblems;

class MyRegex {

	 String zeroTo255="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	    String pattern=zeroTo255 + "\\." +zeroTo255 + "\\." +zeroTo255 + "\\."+zeroTo255; 
}
//000.12.12.034
//000.12.12.034
//121.234.12.12
//23.45.12.56


//invalid-
//00.12.123.123123.123
//122.23
//Hello.IP