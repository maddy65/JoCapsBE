package com.springboot.Ole.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nsedata")


public class NSEData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "symbol")
	private String symbol;
	
	@Column(name = "open")
	private long open;
	
	@Column(name = "high")
	private long high;
	
	@Column(name = "low")
	private long low;
	
	@Column(name = "ltp")
	private long ltp;
	
	@Column(name = "ptsC")
	private long ptsC;
	
	@Column(name = "per")
	private long per;
	
	@Column(name = "trdVol")
	private long trdVol;
	
	@Column(name = "trdVolM")
	private long trdVolM;
	
	@Column(name = "ntp")
	private long ntP;
	
	@Column(name = "mVal")
	private long mVal;
	
	@Column(name = "wkhi")
	private long wkhi;
	
	@Column(name = "wklo")
	private long wklo;
	
	@Column(name = "wkhicm_adj")
	private long wkhicm_adj;
	
	@Column(name = "wklocm_adj")
	private long wklocm_adj;
	
	@Column(name = "xDt")
	private String xDt;
	
	@Column(name = "cAct")
	private String cAct;
	
	@Column(name = "previousClose")
	private long previousClose;
	
	@Column(name = "dayEndClose")
	private long dayEndClose;
	
	@Column(name = "iislPtsChange")
	private long iislPtsChange;
	
	@Column(name = "iislPercChange")
	private long iislPercChange;
	
	@Column(name = "yPC")
	private long yPC;
	
	@Column(name = "mPC")
	private long mPC;
	
	public NSEData() {
		
	}
	public NSEData( String symbol, long open, long high, long low, long ltp, long ptsC, long per, long trdVol,
			long trdVolM, long ntP, long mVal, long wkhi, long wklo, long wkhicm_adj, long wklocm_adj, String xDt,
			String cAct, long previousClose, long dayEndClose, long iislPtsChange, long iislPercChange, long yPC,
			long mPC) {
		super();
		
		this.symbol = symbol;
		this.open = open;
		this.high = high;
		this.low = low;
		this.ltp = ltp;
		this.ptsC = ptsC;
		this.per = per;
		this.trdVol = trdVol;
		this.trdVolM = trdVolM;
		this.ntP = ntP;
		this.mVal = mVal;
		this.wkhi = wkhi;
		this.wklo = wklo;
		this.wkhicm_adj = wkhicm_adj;
		this.wklocm_adj = wklocm_adj;
		this.xDt = xDt;
		this.cAct = cAct;
		this.previousClose = previousClose;
		this.dayEndClose = dayEndClose;
		this.iislPtsChange = iislPtsChange;
		this.iislPercChange = iislPercChange;
		this.yPC = yPC;
		this.mPC = mPC;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public long getOpen() {
		return open;
	}
	public void setOpen(long open) {
		this.open = open;
	}
	public long getHigh() {
		return high;
	}
	public void setHigh(long high) {
		this.high = high;
	}
	public long getLow() {
		return low;
	}
	public void setLow(long low) {
		this.low = low;
	}
	public long getLtp() {
		return ltp;
	}
	public void setLtp(long ltp) {
		this.ltp = ltp;
	}
	public long getPtsC() {
		return ptsC;
	}
	public void setPtsC(long ptsC) {
		this.ptsC = ptsC;
	}
	public long getPer() {
		return per;
	}
	public void setPer(long per) {
		this.per = per;
	}
	public long getTrdVol() {
		return trdVol;
	}
	public void setTrdVol(long trdVol) {
		this.trdVol = trdVol;
	}
	public long getTrdVolM() {
		return trdVolM;
	}
	public void setTrdVolM(long trdVolM) {
		this.trdVolM = trdVolM;
	}
	public long getNtP() {
		return ntP;
	}
	public void setNtP(long ntP) {
		this.ntP = ntP;
	}
	public long getmVal() {
		return mVal;
	}
	public void setmVal(long mVal) {
		this.mVal = mVal;
	}
	public long getWkhi() {
		return wkhi;
	}
	public void setWkhi(long wkhi) {
		this.wkhi = wkhi;
	}
	public long getWklo() {
		return wklo;
	}
	public void setWklo(long wklo) {
		this.wklo = wklo;
	}
	public long getWkhicm_adj() {
		return wkhicm_adj;
	}
	public void setWkhicm_adj(long wkhicm_adj) {
		this.wkhicm_adj = wkhicm_adj;
	}
	public long getWklocm_adj() {
		return wklocm_adj;
	}
	public void setWklocm_adj(long wklocm_adj) {
		this.wklocm_adj = wklocm_adj;
	}
	public String getxDt() {
		return xDt;
	}
	public void setxDt(String xDt) {
		this.xDt = xDt;
	}
	public String getcAct() {
		return cAct;
	}
	public void setcAct(String cAct) {
		this.cAct = cAct;
	}
	public long getPreviousClose() {
		return previousClose;
	}
	public void setPreviousClose(long previousClose) {
		this.previousClose = previousClose;
	}
	public long getDayEndClose() {
		return dayEndClose;
	}
	public void setDayEndClose(long dayEndClose) {
		this.dayEndClose = dayEndClose;
	}
	public long getIislPtsChange() {
		return iislPtsChange;
	}
	public void setIislPtsChange(long iislPtsChange) {
		this.iislPtsChange = iislPtsChange;
	}
	public long getIislPercChange() {
		return iislPercChange;
	}
	public void setIislPercChange(long iislPercChange) {
		this.iislPercChange = iislPercChange;
	}
	public long getyPC() {
		return yPC;
	}
	public void setyPC(long yPC) {
		this.yPC = yPC;
	}
	public long getmPC() {
		return mPC;
	}
	public void setmPC(long mPC) {
		this.mPC = mPC;
	}
	
	
	
}
