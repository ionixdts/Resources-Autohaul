package acme.resources.autohaul;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderComplete {

	public WorkOrderComplete () {
	}

	public WorkOrderComplete (
		java.math.BigDecimal asset, 
		java.math.BigDecimal order) {
		this.asset = asset;
		this.order = order;
	}

	private java.math.BigDecimal asset;
	private java.math.BigDecimal order;
	public java.math.BigDecimal getAsset() {
		return asset;
	}

	public WorkOrderComplete setAsset(java.math.BigDecimal asset) {
		this.asset = asset;
		return this;
	}


	public java.math.BigDecimal getOrder() {
		return order;
	}

	public WorkOrderComplete setOrder(java.math.BigDecimal order) {
		this.order = order;
		return this;
	}

	public String toString() {
		return "WorkOrderComplete ["
		+ " asset: " + asset
		+ " order: " + order
		+ " ]";
	}
}
