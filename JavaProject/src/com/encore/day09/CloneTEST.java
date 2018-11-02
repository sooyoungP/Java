package com.encore.day09;

public class CloneTEST {

	public static void main(String[] args) throws CloneNotSupportedException {
		Computer com = new Computer("s123","»ï¼º",150, 
				new String[] {"windows","16G","2886"});

		Computer com2 = (Computer)com.clone();
		System.out.println(com);
		System.out.println(com2);
		com.spec[1] = "32G";
				
		System.out.println(com);
		System.out.println(com2);
	}

}
