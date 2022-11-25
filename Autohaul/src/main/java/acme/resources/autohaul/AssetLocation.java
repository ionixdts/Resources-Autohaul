package acme.resources.autohaul;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetLocation {

	public AssetLocation () {
	}

	public AssetLocation (
		java.math.BigDecimal latitude, 
		java.math.BigDecimal longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	private java.math.BigDecimal latitude;
	private java.math.BigDecimal longitude;
	public java.math.BigDecimal getLatitude() {
		return latitude;
	}

	public AssetLocation setLatitude(java.math.BigDecimal latitude) {
		this.latitude = latitude;
		return this;
	}


	public java.math.BigDecimal getLongitude() {
		return longitude;
	}

	public AssetLocation setLongitude(java.math.BigDecimal longitude) {
		this.longitude = longitude;
		return this;
	}

	public String toString() {
		return "AssetLocation ["
		+ " latitude: " + latitude
		+ " longitude: " + longitude
		+ " ]";
	}
}
