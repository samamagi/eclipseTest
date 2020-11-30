package main;

import utility.CheckDataValidUtil;

public class CheckDataValid {
	
	

	public static void main(String args[]) {
		
		String formatterDate = "dd/MM/yyyy";
		String requestDate = "30/12/2020";
		if (CheckDataValidUtil.isValidDate(requestDate, formatterDate)) {
			System.out.println("********** E' POSSIBILE PROCEDERE CON LE OPERAZIONI **********");
		} else {
			System.out.println("********** TUTTE LA OPERAZIONI SONO BLOCCATE !!! **********");
		}
		
	}
}
