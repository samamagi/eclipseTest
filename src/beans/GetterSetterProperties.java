package beans;

public class GetterSetterProperties {
	String idInsinuazione;
	String tipologiaDocumento;
	String idPosizione;
	String codiceFiscale;
	public String getIdInsinuazione() {
		return idInsinuazione;
	}
	public void setIdInsinuazione(String idInsinuazione) {
		this.idInsinuazione = idInsinuazione;
	}
	public String getTipologiaDocumento() {
		return tipologiaDocumento;
	}
	public void setTipologiaDocumento(String tipologiaDocumento) {
		this.tipologiaDocumento = tipologiaDocumento;
	}
	public String getIdPosizione() {
		return idPosizione;
	}
	public void setIdPosizione(String idPosizione) {
		this.idPosizione = idPosizione;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	@Override
	public String toString() {
		return "GetterSetterProperties [idInsinuazione=" + idInsinuazione + ", tipologiaDocumento=" + tipologiaDocumento
				+ ", idPosizione=" + idPosizione + ", codiceFiscale=" + codiceFiscale + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
		result = prime * result + ((idInsinuazione == null) ? 0 : idInsinuazione.hashCode());
		result = prime * result + ((idPosizione == null) ? 0 : idPosizione.hashCode());
		result = prime * result + ((tipologiaDocumento == null) ? 0 : tipologiaDocumento.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GetterSetterProperties other = (GetterSetterProperties) obj;
		if (codiceFiscale == null) {
			if (other.codiceFiscale != null)
				return false;
		} else if (!codiceFiscale.equals(other.codiceFiscale))
			return false;
		if (idInsinuazione == null) {
			if (other.idInsinuazione != null)
				return false;
		} else if (!idInsinuazione.equals(other.idInsinuazione))
			return false;
		if (idPosizione == null) {
			if (other.idPosizione != null)
				return false;
		} else if (!idPosizione.equals(other.idPosizione))
			return false;
		if (tipologiaDocumento == null) {
			if (other.tipologiaDocumento != null)
				return false;
		} else if (!tipologiaDocumento.equals(other.tipologiaDocumento))
			return false;
		return true;
	}
}
