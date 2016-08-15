package com.java.designpattern.factory.pizzafm;

/**
 * Chicago pizza店
 * @author taomk
 * 2016年8月15日 上午9:37:54
 */
public class ChicagoPizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see com.java.designpattern.factory.pizzafm.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	Pizza createPizza(String item) {
    	if (item.equals("cheese")) {
        		return new ChicagoStyleCheesePizza();
    	} else if (item.equals("veggie")) {
    	    	return new ChicagoStyleVeggiePizza();
    	} else if (item.equals("clam")) {
    	    	return new ChicagoStyleClamPizza();
    	} else if (item.equals("pepperoni")) {
        		return new ChicagoStylePepperoniPizza();
    	} else return null;
}

}
