package com.jeremiahseagraves.designpatterns.structural.composite;


public class CompositeMenuDemo {

	public static void main(String[] args) {
		
		Menu mainMenu = new Menu("Main", "/main");
		
		Menu safetyMenu = new Menu("Safety", "/safety");

		Menu safetyProfileMenu = new Menu("Profile", "/safety/profile");

		MenuItem safetyPasswordMenuItem = new MenuItem("Password", "/safety/profile/password");

		safetyProfileMenu.add(safetyPasswordMenuItem);

		safetyMenu.add(safetyProfileMenu);
		
		mainMenu.add(safetyMenu);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		
		claimsSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
	}
}
