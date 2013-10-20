package com.rdiachenko.jlv.ui.preferences.additional;

public class LogListViewTableStructureModel {

	private String name;

	private int width;

	private boolean display;

	public LogListViewTableStructureModel(String name, int width, boolean display) {
		this.name = name;
		this.width = width;
		this.display = display;
	}

	public String getName() {
		return name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isDisplay() {
		return display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "[" + name + "][" + width + "][" + display + "]";
	}
}
