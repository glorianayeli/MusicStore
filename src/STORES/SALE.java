package STORES;

public class SALE {
	private int id;
	private String SALE_DATE;
	private String SALE_TIME;
	private int quantity;
	private int FK_OUTLET_NUMBER;
	private int FK_EMP_NUMBER;
	private int FK_CUSTOMER_ID;
	private int FK_PRODUCT_CODE;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSALE_DATE() {
		return SALE_DATE;
	}
	public void setSALE_DATE(String sALE_DATE) {
		SALE_DATE = sALE_DATE;
	}
	public String getSALE_TIME() {
		return SALE_TIME;
	}
	public void setSALE_TIME(String sALE_TIME) {
		SALE_TIME = sALE_TIME;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getFK_OUTLET_NUMBER() {
		return FK_OUTLET_NUMBER;
	}
	public void setFK_OUTLET_NUMBER(int fK_OUTLET_NUMBER) {
		FK_OUTLET_NUMBER = fK_OUTLET_NUMBER;
	}
	public int getFK_EMP_NUMBER() {
		return FK_EMP_NUMBER;
	}
	public void setFK_EMP_NUMBER(int fK_EMP_NUMBER) {
		FK_EMP_NUMBER = fK_EMP_NUMBER;
	}
	public int getFK_CUSTOMER_ID() {
		return FK_CUSTOMER_ID;
	}
	public void setFK_CUSTOMER_ID(int fK_CUSTOMER_ID) {
		FK_CUSTOMER_ID = fK_CUSTOMER_ID;
	}
	public int getFK_PRODUCT_CODE() {
		return FK_PRODUCT_CODE;
	}
	public void setFK_PRODUCT_CODE(int fK_PRODUCT_CODE) {
		FK_PRODUCT_CODE = fK_PRODUCT_CODE;
	}
		
}
