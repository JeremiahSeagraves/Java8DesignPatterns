package com.jeremiahseagraves.designpatterns.structural.composite;

/**
 * This is the leaf element
 */
public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public String toString() {
		return print(this);
	}
}
