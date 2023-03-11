package com.skilldistillery.ufcfighters.entities;

import java.sql.Date;

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
	@Column(name="strike_average_per_minute")
	private double strikeAvg;
	@Column(name="martial_arts_background")
	private String background;
	@Column(name="most_recent_fight")
	private Date lastFight;
	private String stance;
	
	
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
	
	

	public double getStrikeAvg() {
		return strikeAvg;
	}

	public void setStrikeAvg(double strikeAvg) {
		this.strikeAvg = strikeAvg;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public Date getLastFight() {
		return lastFight;
	}

	public void setLastFight(Date lastFight) {
		this.lastFight = lastFight;
	}

	public String getStance() {
		return stance;
	}

	public void setStance(String stance) {
		this.stance = stance;
	}

	@Override
	public String toString() {
		return "UFCFighter [id=" + id + ", name=" + name + ", weightClass=" + weightClass + ", homeCountry="
				+ homeCountry + ", imageurl=" + imageurl + ", strikeAvg=" + strikeAvg + ", background=" + background
				+ ", lastFight=" + lastFight + ", stance=" + stance + "]";
	}

	
	
	
	
	
	
}
