package com.skilldistillery.ufcfighters.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ufc_fighter")
public class UFCFighter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String name;
	@Column(name="weight_class")
	private int weightClass;
	@Column(name="home_country")
	private String homeCountry;
	@Column(name="image_url")
	private String imageurl;
	
	public UFCFighter() {
		super();
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
	public int getWeightClass() {
		return weightClass;
	}
	public void setWeightClass(int weightClass) {
		this.weightClass = weightClass;
	}
	public String getHomeCountry() {
		return homeCountry;
	}
	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Override
	public String toString() {
		return "UFCFighter [id=" + id + ", name=" + name + ", weightClass=" + weightClass + ", homeCountry="
				+ homeCountry + ", imageurl=" + imageurl + "]";
	}
	
	
	
	
	
}
