package org.darkness.oa.model;

import java.util.Set;

/**
 * @author Darkness
 * 
 * QQ: 893951837 Email: darkness_sky@qq.com Blog:
 * http://depravedAngel.javaeye.com/
 * 
 * Copyright (c) 2009 by Darkness
 * 
 * @date Mar 14, 2009 1:52:18 PM
 * @version 1.0
 * @hibernate.class table="T_Organization"
 */
public class Organization {

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
	private String sn;

	/**
	 * @hibernate.property
	 */
	private String description;

	/**
	 * @hibernate.many-to-one column="pid"
	 */
	private Organization parent;

	/**
	 * @hibernate.set inverse="true" lazy="extra"
	 * @hibernate.key column="pid"
	 * @hibernate.one-to-many class="org.darkness.oa.model.Organization"
	 */
	private Set<Organization> children;

	public Set<Organization> getChildren() {
		return children;
	}

	public void setChildren(Set<Organization> children) {
		this.children = children;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Organization getParent() {
		return parent;
	}

	public void setParent(Organization parent) {
		this.parent = parent;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}
}
