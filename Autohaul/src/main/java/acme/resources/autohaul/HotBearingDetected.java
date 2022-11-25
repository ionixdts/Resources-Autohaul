package acme.resources.autohaul;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotBearingDetected {

	public HotBearingDetected () {
	}

	public HotBearingDetected (
		java.math.BigDecimal bearing, 
		java.math.BigDecimal asset) {
		this.bearing = bearing;
		this.asset = asset;
	}

	private java.math.BigDecimal bearing;
	private java.math.BigDecimal asset;
	public java.math.BigDecimal getBearing() {
		return bearing;
	}

	public HotBearingDetected setBearing(java.math.BigDecimal bearing) {
		this.bearing = bearing;
		return this;
	}


	public java.math.BigDecimal getAsset() {
		return asset;
	}

	public HotBearingDetected setAsset(java.math.BigDecimal asset) {
		this.asset = asset;
		return this;
	}

	public String toString() {
		return "HotBearingDetected ["
		+ " bearing: " + bearing
		+ " asset: " + asset
		+ " ]";
	}
}
