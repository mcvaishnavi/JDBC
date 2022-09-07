package com.quinnox;

public class fashion_details {
	
	int id;
	String item_name;
	String type;
	String item_price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getItem_price() {
		return item_price;
	}
	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}
	@Override
	public String toString() {
		return "fashion_details [id=" + id + ", item_name=" + item_name + ", type=" + type + ", item_price="
				+ item_price + "]\n";
	}
	

	

}
