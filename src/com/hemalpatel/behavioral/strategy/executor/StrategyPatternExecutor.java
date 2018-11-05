package com.hemalpatel.behavioral.strategy.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.strategy.bean.CreditCardPaymentMethod;
import com.hemalpatel.behavioral.strategy.bean.GiftCardPaymentMethod;
import com.hemalpatel.behavioral.strategy.bean.Item;
import com.hemalpatel.behavioral.strategy.bean.PaymentMethod;
import com.hemalpatel.behavioral.strategy.bean.PaypalPaymentMethod;
import com.hemalpatel.behavioral.strategy.bean.ShoppingCart;

public class StrategyPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		ShoppingCart cart = new ShoppingCart();
		
		PaymentMethod credit = new CreditCardPaymentMethod();
		PaymentMethod paypal = new PaypalPaymentMethod();
		PaymentMethod giftcard = new GiftCardPaymentMethod();
		
		Item wallet = new Item(123, 34.00);
		Item purse = new Item(143, 134.00);
		Item cover = new Item(456, 2.00);
		
		cart.addItem(wallet);
		cart.addItem(purse);
		cart.addItem(cover);
		
		cart.removeItem(cover);
		
		cart.pay(credit);
		cart.pay(paypal);
		
		cart.addItem(cover);
		cart.pay(giftcard);
		
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Strategy Pattern\n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Strategy Pattern --");
		System.out.println("*********************************\n");
	}

}
