package Generics;

import java.math.BigDecimal;

public class Peach02 extends Fruit {
	Peach02(String name, BigDecimal price) {
		super(name, price);
	}
	
	@Override
	protected String getName() {
		return name;
	}
	
	@Override
	protected BigDecimal getPrice() {
		return price;
	}

}
