package Dessert;

public enum Dessert01 {
	APPLE, ICE_CREAM, CAKE;
//
	public static void main(String[] args) {
//	
//	    System.out.println(Dessert01.APPLE);
//	    System.out.println(Dessert01.ICE_CREAM);
//	    System.out.println(Dessert01.CAKE);
//	

//	
//	    Dessert01 apple = Dessert01.APPLE;
//	    Dessert01 iceCream = Dessert01.ICE_CREAM;
//	    Dessert01 cake = Dessert01.CAKE;
//		
//	    System.out.println(apple);
//	    System.out.println(iceCream);
//		System.out.println(cake);

		
//	比較できる
//		Dessert01 x = Dessert01.APPLE;
//		Dessert01 y = Dessert01.APPLE;
//		System.out.println(x == y);
//		System.out.println(x.equals(y));
		
//	name()
//	列挙した定数名そのものをString型で返す
//		System.out.println(Dessert01.APPLE.name());
		
//	valueOf()
//		Dessert01 apple = Dessert01.valueOf("APPLE");
//		System.out.println(apple);
		
//  ordinal()
//  列挙した順序をint型で返す(0スタート)
		System.out.println(Dessert01.APPLE.ordinal());
		System.out.println(Dessert01.ICE_CREAM.ordinal());
		System.out.println(Dessert01.CAKE.ordinal());
	}
}

