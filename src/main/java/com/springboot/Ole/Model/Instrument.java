package com.springboot.Ole.Model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instrument")
public class Instrument {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "instrument")
	private String instrumentName;
	
	@Column(name = "ltp")
	private float LTP;
	
	@Column(name = "exchange")
	private String exchange;
	
	@Column(name = "joCaps")
	private String joCaps;
	
	
	
	  @OneToMany(mappedBy = "instrument", fetch = FetchType.LAZY)
	  private List<Transictions> transiction;
	 
	
	public String getJoCaps() {
		return joCaps;
	}

	public void setJoCaps(String joCaps) {
		this.joCaps = joCaps;
	}

	public Instrument(String instrumentName, float lTP, String exchange, String joCaps) {
		super();
		this.instrumentName = instrumentName;
		LTP = lTP;
		this.exchange = exchange;
		this.joCaps = joCaps;
	}
	
	public Instrument () {
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public float getLTP() {
		return LTP;
	}
	public void setLTP(float lTP) {
		LTP = lTP;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	
}
