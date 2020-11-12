package com.project.project.controller;

public class Topic {

	
	
	private String id;
	private String name;
	private String Desc;
	public Topic(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		Desc = desc;
	}
	public Topic() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
}
