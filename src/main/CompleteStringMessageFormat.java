package main;

import java.text.MessageFormat;

public class CompleteStringMessageFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String template = "text goes here {0} more text {1}";
		String result = MessageFormat.format(template, "PIPPO", "PLUTO");
		
		System.out.println(result);

	}

}
