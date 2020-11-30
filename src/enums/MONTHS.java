package enums;

/**
 * 
 * @author gisparan
 *
 */
public enum MONTHS {
	GEN(1),
	FEB(2),
	MAR(3),
	APR(4),
	MAG(5),
	GIU(6),
	LUG(7),
	AGO(8),
	SET(9),
	OTT(10),
	NOV(11),
	DIC(12);
	
	private int id;
	
	/**
	 * 
	 * @param id
	 */
	MONTHS(int id) {
		this.id = id;		
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public static MONTHS valueOf(int id) {
        for (MONTHS month : MONTHS.values()) {
            if (month.id == id) return month;
        }
		return null;   
    }

	/**
	 * 
	 * @param val
	 * @return
	 */
	public static int indexOf(String val) {
        for (MONTHS month : MONTHS.values()) {
            if (month.name().equals(val)) return month.id;
        }
		return 0;   
    }
}
