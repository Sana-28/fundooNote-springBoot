package com.fundoonotes.noteservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fundoonotes.userservice.User;

@Entity
@Table(name="Note")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Note {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private Boolean isTrash =false;
	
	@Column
	private Boolean isArchive =false;
	
	@Column
	private Boolean isPin = false;
	
	@Column
	private Date reminder;
	
	@Lob
	@Column
	private byte[]image;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;


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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}