package com.glo.glo_logistics.model;

public class Fleet {
	private int id;
	private String name;
	private String type;

	// Constructors
	public Fleet() {
	}

	public Fleet(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	// Getters and Setters
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Fleet [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
}
