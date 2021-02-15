package STORES;

public class PRODUCT {
	private String artist;
	private String title;
	private float cost;
	private float sale_price;
	private int product_code;
	
	public PRODUCT( int product_code, String artist, String title, float cost, float sale_price) {
		super();
		this.product_code = product_code;
		this.artist = artist;
		this.title = title;
		this.cost = cost;
		this.sale_price = sale_price;
	}

	
	/*Getters and Setters*/
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public float getSale_price() {
		return sale_price;
	}
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

}
