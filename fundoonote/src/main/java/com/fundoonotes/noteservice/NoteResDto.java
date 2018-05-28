package com.fundoonotes.noteservice;

import java.util.Date;

public class NoteResDto {

	
private int id;
	
	private String title;
	
	private String description;
	
	private Boolean isTrash =false;
	
	private Boolean isArchive =false;
	
	private Boolean isPin = false;
	
	private Date reminder;
	
	private String color;
	
	private byte[]image;

	public NoteResDto(Note note) {
		this.id = note.getId();
		this.title=note.getTitle();
		this.description=note.getDescription();
		this.isTrash=note.getIsTrash();
		this.isPin=note.getIsPin();
		this.isArchive=note.getIsArchive();
		this.reminder=note.getReminder();
		this.image = note.getImage();
		this.color=note.getColor();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsTrash() {
		return isTrash;
	}

	public void setIsTrash(Boolean isTrash) {
		this.isTrash = isTrash;
	}

	public Boolean getIsArchive() {
		return isArchive;
	}

	public void setIsArchive(Boolean isArchive) {
		this.isArchive = isArchive;
	}

	public Boolean getIsPin() {
		return isPin;
	}

	public void setIsPin(Boolean isPin) {
		this.isPin = isPin;
	}

	
	public Date getReminder() {
		return reminder;
	}

	public void setReminder(Date reminder) {
		this.reminder = reminder;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}

