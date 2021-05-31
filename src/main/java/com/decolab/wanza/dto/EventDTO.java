package com.decolab.wanza.dto;

import java.io.Serializable;

public class EventDTO implements Serializable{
	
	private int eventSeq;
	private String eventTitle;
	private String eventContent;
	private int readCount;
	private String eventDate;
	private String eventStartDate;
	private String eventEndDate;
	private String eventFilename;
	private int eventDel;
	private int productSeq;
	
	public EventDTO() {
		// TODO Auto-generated constructor stub
	}

	public EventDTO(int eventSeq, String eventTitle, String eventContent, int readCount, String eventDate,
			String eventStartDate, String eventEndDate, String eventFilename, int eventDel, int productSeq) {
		super();
		this.eventSeq = eventSeq;
		this.eventTitle = eventTitle;
		this.eventContent = eventContent;
		this.readCount = readCount;
		this.eventDate = eventDate;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
		this.eventFilename = eventFilename;
		this.eventDel = eventDel;
		this.productSeq = productSeq;
	}

	public int getEventSeq() {
		return eventSeq;
	}

	public void setEventSeq(int eventSeq) {
		this.eventSeq = eventSeq;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventContent() {
		return eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(String eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public String getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getEventFilename() {
		return eventFilename;
	}

	public void setEventFilename(String eventFilename) {
		this.eventFilename = eventFilename;
	}

	public int getEventDel() {
		return eventDel;
	}

	public void setEventDel(int eventDel) {
		this.eventDel = eventDel;
	}

	public int getProductSeq() {
		return productSeq;
	}

	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
	}

	@Override
	public String toString() {
		return "EventDto [eventSeq=" + eventSeq + ", eventTitle=" + eventTitle + ", eventContent=" + eventContent
				+ ", readCount=" + readCount + ", eventDate=" + eventDate + ", eventStartDate=" + eventStartDate
				+ ", eventEndDate=" + eventEndDate + ", eventFilename=" + eventFilename + ", eventDel=" + eventDel
				+ ", productSeq=" + productSeq + "]";
	}

	
	
	
}
