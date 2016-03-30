package com.support.android.designlibdemo.model;

/**
 * @author Paul Soman.
 */
public class RowItem {
	private String title;
	private String type;

	public RowItem(String title, String type) {
		this.title = title;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
