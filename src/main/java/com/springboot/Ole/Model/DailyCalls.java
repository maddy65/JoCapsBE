package com.springboot.Ole.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dailyCalls")

public class DailyCalls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String exchange;
	private Date dailyDate;
	private String stockName;
	private Long target;
	private Long stopLoass;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public Date getDailyDate() {
		return dailyDate;
	}
	public void setDailyDate(Date dailyDate) {
		this.dailyDate = dailyDate;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Long getTarget() {
		return target;
	}
	public void setTarget(Long target) {
		this.target = target;
	}
	public Long getStopLoass() {
		return stopLoass;
	}
	public void setStopLoass(Long stopLoass) {
		this.stopLoass = stopLoass;
	}
	public DailyCalls( String exchange, Date dailyDate, String stockName, Long target, Long stopLoass) {
		super();
		
		this.exchange = exchange;
		this.dailyDate = dailyDate;
		this.stockName = stockName;
		this.target = target;
		this.stopLoass = stopLoass;
	}
	
	public DailyCalls() {
		
	}
	
	
}
