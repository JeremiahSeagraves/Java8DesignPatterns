package com.jeremiahseagraves.designpatterns.structural.bridge.shapewithbridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
