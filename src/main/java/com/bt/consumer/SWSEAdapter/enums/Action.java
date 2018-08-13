package com.bt.consumer.SWSEAdapter.enums;

public enum Action {
	Delete("Delete"), Update("Update"), Add("Add"), None("-");
	public final String val;

	private Action(String val) {
		this.val = val;
	}

	public String val() {
		return val;
	}
}
