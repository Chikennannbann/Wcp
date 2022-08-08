package Dessert;

public enum DessertPrice01 {
	APPLE(100), ICE_CREAM(200), CAKE(300);
	
	private int price;
	
	private DessertPrice01(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		System.out.println(DessertPrice01.APPLE.getPrice());
		System.out.println(DessertPrice01.ICE_CREAM.getPrice());
		System.out.println(DessertPrice01.CAKE.getPrice());
	}
}
