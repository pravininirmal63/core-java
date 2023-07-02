package com.app.core;

public class Books implements Comparable<Books> {
	private int id;
	private String name;
	private double price;
	private int qty;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}

	public Books(int id, String name, double price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}

	@Override
	public int compareTo(Books o) {
		if(this.qty>o.qty) {
			return 1;
		}
		else if(qty<o.qty) {
			return -1;
		}
		else {
			return 0;  
		}
	}

	@Override
	public boolean equals(Object obj) {
		if(this.name.equals(((Books)obj).name)) {
			return true;
		}
		else 
			return false;
	}
	
}
