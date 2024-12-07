package com.klef.jfsd.lab_examend;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private double price;
	public void setBrand(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setModel(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPrice(double d) {
		// TODO Auto-generated method stub
		
	}

    // Getters and Setters
}
