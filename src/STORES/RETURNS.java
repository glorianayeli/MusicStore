package STORES;

public class RETURNS {
	private int FK_OUTLET_NUMBER;
	private int FK_PRODUCT_CODE;
	private int FK_CUSTOMER_ID;
	private String RETURN_DATE;
	private String RETURN_TIME;
	private int quantity;
	private String reason;

	public int getFK_OUTLET_NUMBER() {
		return FK_OUTLET_NUMBER;
	}
	public void setFK_OUTLET_NUMBER(int fK_OUTLET_NUMBER) {
		FK_OUTLET_NUMBER = fK_OUTLET_NUMBER;
	}
	public int getFK_PRODUCT_CODE() {
		return FK_PRODUCT_CODE;
	}
	public void setFK_PRODUCT_CODE(int fK_PRODUCT_CODE) {
		FK_PRODUCT_CODE = fK_PRODUCT_CODE;
	}
	public int getFK_CUSTOMER_ID() {
		return FK_CUSTOMER_ID;
	}
	public void setFK_CUSTOMER_ID(int fK_CUSTOMER_ID) {
		FK_CUSTOMER_ID = fK_CUSTOMER_ID;
	}
	public String getRETURN_DATE() {
		return RETURN_DATE;
	}
	public void setRETURN_DATE(String rETURN_DATE) {
		RETURN_DATE = rETURN_DATE;
	}
	public String getRETURN_TIME() {
		return RETURN_TIME;
	}
	public void setRETURN_TIME(String rETURN_TIME) {
		RETURN_TIME = rETURN_TIME;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
