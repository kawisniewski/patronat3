package com.example.helloworld.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "numbers")
@NamedQueries({
		@NamedQuery(
				name = "com.example.helloworld.core.Number.findAll",
				query = "SELECT p FROM Number p"
				)
})

public class Number {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "number", nullable = false)
	private double number;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public double getNumber() {
		return number;
	}
	
	public void setNumber(double number) {
		this.number = number;
	}

}
