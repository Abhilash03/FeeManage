package com.sam.BERI.fee.Dto;

public class TransferDto {
	private int tAmt;
	private String sacno;
	private String racno;
	private String tid;
	private String date;
	private String time;
	private String remark;
	private String transType;
	private String startDate;
	private String lastDate;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int gettAmt() {
		return tAmt;
	}
	public void settAmt(int tAmt) {
		this.tAmt = tAmt;
	}
	public String getSacno() {
		return sacno;
	}
	public void setSacno(String sacno) {
		this.sacno = sacno;
	}
	public String getRacno() {
		return racno;
	}
	public void setRacno(String racno) {
		this.racno = racno;
	}
	
	
}

