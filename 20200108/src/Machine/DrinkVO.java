package Machine;

public class DrinkVO {
	private String name;
	private int stock;
	private int price;
	
	public DrinkVO(String name, int stock, int price) {
		
		this.name = name;
		this.stock = stock;
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
