package com.continentino.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {
private static final long serialVersionUID = 1L;
 
    private Long id;
    private String name;
    private Double dailylncome;

	public Worker(Long id, String name, Double dailylncome) {
		this.id = id;
		this.name = name;
		this.dailylncome = dailylncome;
	}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDailylncome() {
		return dailylncome;
	}
	public void setDailylncome(Double dailylncome) {
		this.dailylncome = dailylncome;
	}

	public Worker() {
	}
}
