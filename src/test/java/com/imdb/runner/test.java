package com.imdb.runner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=java.time.LocalTime.now().toString();
	    String s1=s.replace(":","");
	    String s3=s1.replace(".","");
	    System.out.println(s3);
	}

}
