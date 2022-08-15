package com.springboot.Ole.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "transiction")
public class Transictions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "userId")
	private Long userId;
	
	@Column(name = "instrumentName")
	private String InstrumentName;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "transictionDate")
	private Date transictionDate;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	 //@ManyToOne
	//@JoinColumn(name = "instrument", referencedColumnName = "instrument_name") 
	  private Instrument instrument;
	 
	
	public Transictions() {
	}
	
	public Transictions(Long userId, String instrumentName, int quantity, double price, Date transictionDate) {
		super();
		this.userId = userId;
		InstrumentName = instrumentName;
		this.quantity = quantity;
		this.price = price;
		this.transictionDate = transictionDate;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getInstrumentName() {
		return InstrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		InstrumentName = instrumentName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getTransictionDate() {
		return transictionDate;
	}
	public void setTransictionDate(Date transictionDate) {
		this.transictionDate = transictionDate;
	}
	
	
}
