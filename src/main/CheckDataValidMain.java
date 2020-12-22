package main;

import utility.CheckDataValid;

public class CheckDataValidMain {
	
	

	public static void main(String args[]) {
		
		String formatterDate = "dd/MM/yyyy";
		String requestDate = "25/2/2020";
		
		if (CheckDataValid.isValidDate(requestDate, formatterDate)) {
			System.out.println("********** E' POSSIBILE PROCEDERE CON LE OPERAZIONI **********");
		} else {
			System.out.println("********** TUTTE LA OPERAZIONI SONO BLOCCATE !!! **********");
		}
		
	}
}
