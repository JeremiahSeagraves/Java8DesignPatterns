package com.jeremiahseagraves.designpatterns.structural.decorator;

public class DecoratorSandwichDemo {

    public static void main(String args[]) {
        Sandwich simpleSandwich = new SimpleSandwich();
        System.out.println(simpleSandwich.make());

        Sandwich meatSandwich = new MeatDecorator(simpleSandwich);
        System.out.println(meatSandwich.make());

        Sandwich dressingMeatSandwich = new DressingDecorator(meatSandwich);

        System.out.println(dressingMeatSandwich.make());

        //same as

		System.out.println(new DressingDecorator(new MeatDecorator(new SimpleSandwich())).make());
    }
}
