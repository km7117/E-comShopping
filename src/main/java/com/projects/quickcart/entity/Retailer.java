package com.projects.quickcart.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity

@DiscriminatorValue("RETAILER")
public class Retailer extends MyUser {
	
	

}
