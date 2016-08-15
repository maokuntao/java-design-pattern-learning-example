package com.java.designpattern.factory.pizzafm;

/**
 * New York pizza店
 * @author taomk
 * 2016年8月15日 上午9:42:43
 */
public class NYPizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see com.java.designpattern.factory.pizzafm.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}

}
