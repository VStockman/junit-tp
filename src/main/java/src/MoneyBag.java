package src;

import java.util.ArrayList;

public class MoneyBag {


public static ArrayList<Money> myMoneyBag = new ArrayList<Money>();

static {
	myMoneyBag.add(new Money(2, "EUR"));
	myMoneyBag.add(new Money(4, "EUR"));
	myMoneyBag.add(new Money(7, "EUR"));
}


public void add(Money money) {
	if(money.fCurrency.equals(myMoneyBag.get(0).fCurrency)) {
		myMoneyBag.add(money);
	}
}

public void subb(Money money) {
	for (int i = 0; i < myMoneyBag.size() -1; i++) {
		if(myMoneyBag.get(i).equals(money) ) {
			myMoneyBag.remove(i);
		}
	}
}

public void normalize(String currency) {
	for (int i = 0; i < myMoneyBag.size() -1; i++) {
		myMoneyBag.get(i).fCurrency = currency;
	}	
}
}
