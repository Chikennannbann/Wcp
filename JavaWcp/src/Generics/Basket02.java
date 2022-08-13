package Generics;

import java.math.BigDecimal;

public class Basket02<E extends Fruit> {
	private E elem;
	private final BigDecimal PRICE = new BigDecimal(100);
	
	Basket02(E e) {
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	void printName() {
		System.out.println("籠の中身は" + elem.getName() + "です");
	}
	
	void printTotalPrice() {
		BigDecimal totalPrice = PRICE.add(elem.getPrice());
		System.out.println(elem.getName() + "の入った籠の合計" + totalPrice + "です");
	}
	
	public static void main(String[] args) {
		Basket02<Apple02> appleBasket = new Basket02<>(new Apple02("ふじ", new BigDecimal(200)));
		Basket02<Peach02> peachBasket = new Basket02<>(new Peach02("黄金桃", new BigDecimal(300)));
		
		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
	}

}
