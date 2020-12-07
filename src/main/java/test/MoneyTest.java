package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import src.Money;
import src.MoneyBag;

public class MoneyTest {
	
	private Money money = new Money(10, "EUR");

	@org.junit.Test
	public void CheckPositiveAmountTest() {
		assertTrue(money.Amount() >= 0);
	}
	
	@org.junit.Test
	public void ISORuleForCurrencyTest() {
		assertTrue(money.Currency().length() == 3);
		assertTrue(money.Currency() == "EUR" 
				|| money.Currency() == "USD" 
				|| money.Currency() == "CHF" 
				|| money.Currency() == "GBP");
	}
	
	@org.junit.Test
	public void AdditionTest() {
		Money moneyToAddEur = new Money(20, "EUR");
		Money moneyToAddUsd = new Money(40, "USD");
		
		assertEquals(money.add(moneyToAddEur).Amount(), 30);
	}
	
	@org.junit.Test
	public void MoneyBag() {
		MoneyBag myMoneyBag = new MoneyBag();
		myMoneyBag.add(new Money(20, "EUR"));
		myMoneyBag.subb(new Money(20, "EUR"));
		myMoneyBag.normalize("USD");
	}
}