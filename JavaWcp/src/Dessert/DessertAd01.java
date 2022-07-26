package Dessert;

public enum DessertAd01 {
	APPLE(100) {
		@Override
		void advertise() {
			System.out.println("真っ赤なりんごが" + getPrice() + "円！");
		}
	},
	
	ICE_CREAM(200) {
		@Override
		void advertise() {
			System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円！");
		}
	},
	
	CAKE(300) {
		@Override
		void advertise() {
			System.out.println("みんな大好き甘いケーキが" + getPrice() + "円！");
		}
	};
	
	private int price;
	
	private DessertAd01(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	abstract void advertise();
	
	public static void main(String[] args) {
		DessertAd01.APPLE.advertise();
		DessertAd01.ICE_CREAM.advertise();
		DessertAd01.CAKE.advertise();
	}

}
