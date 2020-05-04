package com.jeremiah.designpatterns.creational.builder.telescope;

/**
 * This way, we don't have setters and we force field to be set through the use of overloaded constructors, but the problem is that we have various
 * constructors and so, the cognitive load increments, moreover, we would need to have N constructors, N being the combinatorial size
 * of all combinations with the class fields.
 */
public class LunchOrderTeleDemo {

	public static void main(String args[]) {

		LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

		// lunchOrderTele.setBread("Wheat");
		// lunchOrderTele.setCondiments("Lettuce");
		// lunchOrderTele.setDressing("Mustard");
		// lunchOrderTele.setMeat("Ham");

		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiments());
		System.out.println(lunchOrderTele.getDressing());
		System.out.println(lunchOrderTele.getMeat());
	}

}
