package main;

import beans.GetterSetterProperties;

public class CheckSqlInjection {

	public static void main(String[] args) {
		printResultObject();
		printResultString();
	}
	
	public static void printResultObject() {
		GetterSetterProperties vapt = new GetterSetterProperties();
		vapt.setIdPosizione("'");
		 if(vapt.getIdPosizione() != null && (vapt.getIdPosizione().contains("&#39;") || vapt.getIdPosizione().contains("'"))) {
			 //System.out.println("vapt.getIdPosizione(): " + vapt.getIdPosizione());
			 System.out.println("(OBJECT) VALORE NON CORRETTO: " + vapt.getIdPosizione());
		 } else {
			 //System.out.println("vapt.getIdPosizione(): " + vapt.getIdPosizione());
			 System.out.println("(OBJECT) VALORE CORRETTO: " + vapt.getIdPosizione());
		 }		
	}

	public static void printResultString() {
		String vapt = "'";
		 if(vapt != null && (vapt.contains("&#39;") || vapt.contains("'"))) {
			 //System.out.println("vapt.getIdPosizione(): " + vapt.getIdPosizione());
			 System.out.println("(STRING) VALORE NON CORRETTO: " + vapt);
		 } else {
			 //System.out.println("vapt.getIdPosizione(): " + vapt.getIdPosizione());
			 System.out.println("(STRING) VALORE CORRETTO: " + vapt);
		 }
	
	}
}
