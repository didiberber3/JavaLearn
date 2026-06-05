package com.jl.homework342.hm09;

public class LabeledPoint extends Point {
	private String label;

	public LabeledPoint(String label, double x, double y) {
		super(x, y);
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label + "的坐标是" + getX() + " " + getY();
	}
}
