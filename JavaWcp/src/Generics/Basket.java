package Generics;

public class Basket<E> {
	private E elem;
	
	Basket(E e) {
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName());
		
		appleBasket.replace(new Apple("紅玉"));
		System.out.println(appleBasket.get().getName());
		
//		Apple型で限定されたためPeachはコンパイルエラー
//		appleBasket.replace(new Peach("黄金桃"));
	}
	

}
