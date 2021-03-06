package org.darkness.oa.model;

/**
 * @author Darkness
 * 
 * QQ: 893951837 Email: darkness_sky@qq.com Blog:
 * http://depravedAngel.javaeye.com/
 * 
 * Copyright (c) 2009 by Darkness
 * 
 * @date Mar 14, 2009 1:46:47 PM
 * @version 1.0
 * @hibernate.class table="T_Person"
 */
public class Person {

	/**
	 * @hibernate.id generator-class="native"
	 */
	private int id;

	/**
	 * @hibernate.property
	 */
	private String name;

	/**
	 * @hibernate.property
	 */
	private String sex;

	/**
	 * @hibernate.property
	 */
	private String address;

	/**
	 * @hibernate.property
	 */
	private String duty;

	/**
	 * @hibernate.property
	 */
	private String phone;

	/**
	 * @hibernate.property
	 */
	private String description;

	/**
	 * @hibernate.many-to-one
	 */
	private Organization org;

	/**
	 * Person 1-----1 User
	 * 
	 * @hibernate.one-to-one property-ref="person"
	 */
	private User user;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
